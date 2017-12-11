package com.lanou3g.String;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class StringDemo {
		public static void main(String[] args) throws UnsupportedEncodingException {
				String a = "   bvcaafg 我阿萨德按时   ";
				String b = "111111";
				//获取字符串长度
//				System.out.println(a.length());

				
				//取出字符串前后的空格
				a.trim();  
				
				//---> 输出结果任然没有去除空格
				a = a.trim();  ///-----> 这样的话输出结果就去除了空格
				
				
				
				
				//替换  把a替换成h
				//替换,把a替换成h
				//知识返回替换的结果,并不会把结果赋值给a
				System.out.println(a.replace("a", "b"));
				//System.out.println(a.replace(a, b));
				//System.out.println(a);
//				System.out.println(b);
				
				
				//取字符串中的子串
				//从0位置取到1
				
				//这是左闭右开的区间
				//[0,2)所以就是从0取到1
				System.out.println(b.substring(0, 5));
				
				//取字符串中的子串
				//从4开始一直去到末尾
				System.out.println(a.substring(4));
				
				//分割字符串
				//以e为条件分割字串
				//会得到一个新的字符串的数组
				System.out.println(Arrays.toString(a.split("a")));
		
				
				//比较字符串
				a.equals("avas");
				//无视大小写
				a.equalsIgnoreCase("BVCAAFG");
				//判断俩个字符串的内容
				System.out.println(a.equals("avas"));
				System.out.println(a.equalsIgnoreCase("BVCAAFG"));
				
				//获取第一个字符c在a这个字符串中的位置
				//如果不存在c,则返回-1;
				int index = a.indexOf('d');
				int index2 = a.indexOf('a');
				System.out.println(index2);
				System.out.println(index);
				//输入的index值一定要在字符串长度内
				//否则会报错
				//输出第index位置的值
				char ch = a.charAt(2);
				System.out.println(ch);
				
				//是否以a开头,返回boolean的true或false
				a.startsWith("a");
				
				//是否以a结尾
				a.endsWith("a");
				
				//将字符串进行连接
				String cString =a.concat("我是后连上的");
				System.out.println(cString);
				
				//a是否包含bca
				boolean	d	= a.contains("bca");
				System.out.println(d);
				//将字符串中的小写字母转化成大写字母
				String eString =a.toUpperCase();	
				System.out.println(eString);
				//将字符串中的大写字母转化成小写字母
				a.toLowerCase();
				
				//得到a字符串的字符数组
				char[] chs = a.toCharArray();
				System.out.println(chs);
				
				//设计到编码转化的
				
				
				//获得a字符串的字节数组
				byte[] bytes =  a.getBytes();
				
				// 字体格式: 
				String aa = new String(bytes,"gbk");
				System.out.println(aa);
		}
}
