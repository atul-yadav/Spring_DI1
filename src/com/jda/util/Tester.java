package com.jda.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jda.beans.Address;
import com.jda.beans.Answer;
import com.jda.beans.Employee;
import com.jda.beans.Myfirst;
import com.jda.beans.Question1;
import com.jda.beans.Questions;

public class Tester {

	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		/*
		Myfirst first = (Myfirst) context.getBean(Myfirst.class);
		first.thisMethod();
		//System.out.println(first.getData());
		//System.out.println(first.getCount());
		
		Address address = context.getBean(Address.class);
		
		//System.out.println(address);
		
		Employee employee = context.getBean(Employee.class);
		
		//employee.show();
		
		Questions question = context.getBean(Questions.class);
		//question.displayInfo();
		System.out.println("-----------------------------------------");
		
		Answer answer = context.getBean(Answer.class);
		//System.out.println(answer);
		 question.displayInfo();
		 */
		
		Question1 question = context.getBean(Question1.class);
		question.displayInfo();
		
	}
}
