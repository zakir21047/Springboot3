package com.ojas.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.SpringCoreXML.module.Employee;
import com.ojas.SpringCoreXML.module.Student;

public class StudentTest {
public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("StudentConfig.class");
    Student s = (Student)ac.getBean("mystudent");
    System.out.println(s.dispName());
}
}
