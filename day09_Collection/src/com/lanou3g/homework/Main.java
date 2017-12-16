package com.lanou3g.homework;

import com.lanou3g.exception.LoginException;
import com.lanou3g.exception.RegisterException;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.lanou3g.homework.XMl.write;

public class Main {
    private  static final int REGISTER_CODE = 1;
    private  static final int LOGIN_CODE = 2;
    static SAXReader reader = new SAXReader();
    static Document document = null;
    public static void main(String[] args) throws Exception {
        //插进xml



        //读取文件




        注册登录();
    }

    private static void 注册登录() throws Exception {
        new UserData();
        UserInter userInter = null;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1.登录\t\t2.注册");

            int key = scanner.nextInt();
            scanner.nextLine();
            if (key == 1) {

                System.out.println("请输入用户名");
                String userName = scanner.nextLine();
                System.out.println("请输入密码");
                String password = scanner.nextLine();
                try {
                    userInter = UserOperate.Login(userName,password);
                } catch (LoginException e) {
                    System.err.println(e.getMessage());
                    continue;
                }
                break;
            }else if(key == 2){

                document = reader.read(new File("src/resginterMessage.xml"));
                XMl.allEles(document.getRootElement());
                Person person1 = new Person();

                System.out.println("请输入你的大名:");
                person1.setName(scanner.nextLine());
                System.out.println("请输入你的用户名");
                person1.setUserName(scanner.nextLine());
                System.out.println("请输入登录密码");
                person1.setPassword(scanner.nextLine());
                write(person1);

                choose(person1);

                try {
                    UserOperate.register(person1);
                } catch (RegisterException e) {
                    System.err.println(e.getMessage());
                    continue;
                }
                // System.out.println(UserData.getList().size());
            }
            else{
                System.out.println("输入错误,请重新输入!");
            }
        }
        if(userInter != null){
            Person person = (Person)userInter;
            person.show();
            long l = System.currentTimeMillis();
            SimpleDateFormat dFormat  = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String time = dFormat.format(l);
            System.out.println("当前系统时间:" + time);
            System.out.println("是否开始工作:\t\t1.工作\t\t2.下班");
            int key = scanner.nextInt();
            switch (key){
                case REGISTER_CODE:
                    userInter.onLine();
                    break;
                case LOGIN_CODE:
                    userInter.offLine();
                    break;
                default:
                    break;
            }
        }
    }



    public static void choose(Person person){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择您的职业");
        System.out.println("1.Worker\t2.Doctor\t3.Cooker\t4.Boss");
        int por = scanner.nextInt();
        switch (por){
            case 1:
                person.setProfession("Worker");
                break;
            case 2:
                person.setProfession("Doctor");
                break;
            case 3:
                person.setProfession("Cooker");
                break;
            case 4:
                person.setProfession("Boss");
                break;
            default:
                System.out.println("错误,请重新输入");
                choose(person);
                break;
        }
    }


}
