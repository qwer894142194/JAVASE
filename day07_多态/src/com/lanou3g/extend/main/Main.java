package com.lanou3g.extend.main;

import com.lanou3g.extend.BigCar;
import com.lanou3g.extend.Mythis;

public class Main {
		public static void main(String[] args) {
//			BigCar  big = new BigCar();
//			big.setColor("黑色");
//			System.out.println(big.getColor());
////			big.showThis();
			
			Mythis mythis = new Mythis();
			mythis.name = "this";//方法里的this指的就是mythis
			mythis.Myname("this");
			
			Mythis  mythis2 = new Mythis();
			mythis2.name ="this2"; 
			mythis2.Myname("this2");//放法里的this指的就是mythis2
		}
}	
