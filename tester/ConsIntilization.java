package com.xworkz.food.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.food.app.Home;
import com.xworkz.food.app.Xworkz;

public class ConsIntilization {

	public static void main(String[] args) {

		Xworkz xworkz = new Xworkz(12);

		//Home home=new Home();
		System.out.println("******************");
		final long startTime = System.currentTimeMillis();
		System.out.println("using spring ");
		String path="resources/init.xml";
		ApplicationContext container=new ClassPathXmlApplicationContext(path);
		
		Xworkz refOfXworkz=container.getBean(Xworkz.class);
		System.out.println(refOfXworkz.getNoOfTrainers());
		
		Home refOfHome1=container.getBean("home",Home.class);
		System.out.println(refOfHome1.hashCode());
		
		Home refOfHome2=container.getBean("home2",Home.class);
		System.out.println(refOfHome2.hashCode());
		
		final long endTime = System.currentTimeMillis();
		
		System.out.println("Total execution time: " + (endTime - startTime));


		

	}

}
