package com.xworkz.food.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.food.app.Hotel;
import com.xworkz.food.app.Tree;

public class SpringTester {

	public static void main(String[] args) {

		String pathOfXml = "resources/spring.xml";
		ApplicationContext spring =
				new ClassPathXmlApplicationContext(pathOfXml);
		int beanCount = spring.getBeanDefinitionCount();
		System.out.println("beanCount \t" + beanCount);
		Hotel refOfHotel = spring.getBean(Hotel.class);

		refOfHotel.order("Chicken", 1);

		System.out.println("*******************");
		Tree refOfTree = spring.getBean("tree2", Tree.class);
		System.out.println(refOfTree.hashCode());

	}

}
