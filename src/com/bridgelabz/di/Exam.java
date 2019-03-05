package com.bridgelabz.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

		ApplicationContext cont=new ClassPathXmlApplicationContext("");
		Student stud =cont.getBean("student",Student.class);
		stud.displayStudentInfo();
		
	}


}