package com.lanou3g.homework;

import com.lanou3g.exception.*;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserOperate {
    static SAXReader reader = new SAXReader();
    static Document document = null;

    // Map修改的登录方法
    public static UserInter Login(String userName,String password) throws LoginException, DocumentException {
        Person person = UserData.getMap().get(userName);
        if (person == null) {
            throw new NotUserNameException();
        }
        if (! password.equals(person.getPassword())){
            throw new NotMatchUserNameAndPasswordException();
        }

      /*  document = reader.read(new File("src/resginterMessage.xml"));
        List<Attribute> attributes = document.getRootElement().attributes();

        List<Element> elements = document.getRootElement().elements();
        for(int i =0; i < attributes.size();i++){
            Attribute att  =   attributes.get(i);
            if(userName.equals(attributes.get(i))){
                continue;
            }
            if(password.equals(attributes.get(i))){
                break;
            }

        }*/

        System.out.println("登录成功");
        String name = person.getName();
        String joob = person.getProfession();
        switch (joob) {
            case "Worker":
                return new Worker(name,userName,password,joob);
            case "Docter":
                return  new Doctor(name,userName,password,joob);
            case "Cooker":
                return new Cooker(name,userName,password,joob);
            case "Boss":
                return new Boss(name,userName,password,joob);
            default:
                break;
        }
        return null;
    }

    // Map 的注册方法
    public static void register(Person person)throws RegisterException{
        Person person1 = UserData.getMap().get(person.getUserName());
        if (person1 != null){
            throw new UserNameExistException();
        }
        if(person.getUserName().length() < 3){
            throw new UserNameTooShortException();
        }
        if (person.getUserName().length() >10){
            throw new UserNameTooLongException();
        }
        if (person.getPassword().length() > 16){
            throw new PasswordTooLongException();
        }
        if (person.getPassword().length() < 7){
            throw new PasswordTooShortException();
        }
        if (Instrument.instrument(person.getPassword())){
            throw new PasswordInsecureException();
        }
        Map<String , Person> map = new HashMap<>();
        map.put(person.getUserName(),person);
        UserData.setMap(map);
    }
}
