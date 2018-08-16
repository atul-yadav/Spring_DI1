package com.jda.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jda.beans.Employee_Setter;
import com.jda.beans.Question1;
import com.jda.beans.Questions;
import com.jda.beans.Questions_Setter;

public class Tester_Setter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		//Employee_Setter emp = context.getBean(Employee_Setter.class);
		//emp.display();
		Questions_Setter q = context.getBean(Questions_Setter.class);
		q.displayInfo();
		

	}

}
