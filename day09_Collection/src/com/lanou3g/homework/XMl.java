package com.lanou3g.homework;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lanou3g.exception.LoginException;
import com.lanou3g.exception.RegisterException;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
public class XMl {
    static SAXReader reader = new SAXReader();
    static Document document = null;



    //读取:
    public static void read(Document document) throws DocumentException {
        SAXReader saxReader = new SAXReader( );
        Document document1 = saxReader.read(new File("src/resginterMessage.xml"));
        Element rootElement = document1.getRootElement();
        Element person = rootElement.element("person");

        List<Person>  userData= new ArrayList<>();
        Element element = rootElement.element("username");
        element.addAttribute("ueername","");
        Element element1 = rootElement.element("password");
        element1.addAttribute("password","");

    }
        //写入xml文件
    public static void  write(Person person) throws Exception{
        SAXReader saxReader = new SAXReader( );
        Document document = saxReader.read(new File("src/resginterMessage.xml"));

        //XMl.read(document);

        //创建一个peroson标签
        Element rootElement = document.getRootElement();

        Element username1 = rootElement.addElement("username");

        username1.addAttribute("username" ,person.getUserName());

        Element password1 = rootElement.addElement("password");

        password1.addAttribute("password",person.getPassword());

        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");

        XMLWriter xmlWriter = new XMLWriter(new FileWriter("src/resginterMessage.xml"), format);
        xmlWriter.write(document);

        //将xml写在文本中
        //关闭文件

        xmlWriter.close();

    }
    //遍历方法
    public static void allEles(Element e) throws DocumentException {
        document = reader.read(new File("src/resginterMessage.xml"));
        List<Attribute> attributes = e.attributes();

        List<Element> elements = e.elements();
        for(int i =0; i < attributes.size();i++){
            Attribute att  =   attributes.get(i);

            System.out.println("属性名为："+att.getName()
                    +"\t属性值为："+att.getValue());
        }
    }
}
