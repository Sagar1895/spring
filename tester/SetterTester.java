package com.xworkz.food.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.food.app.Cricket;
import com.xworkz.food.app.Xworkz;
import com.xworkz.food.app.database;

public class SetterTester {

	public static void main(String[] args) {
		String path="resource/thread.xml";
		ApplicationContext container=new ClassPathXmlApplicationContext(path);
		
		//database refOfXworkz=container.getBean(database.class);
	//	System.out.println(refOfXworkz.getName());
		
	//	Cricket refrencce=container.getBean(Cricket.class);
		//System.out.println(refrencce.getTeamname());
		//System.out.println(refrencce.getNoofplayers());
		
		
		Thread thread=container.getBean(Thread.class);
		System.out.println(thread);
		
	}
	
	
	
	
}
