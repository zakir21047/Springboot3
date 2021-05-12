package com.ojas.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ojas.SpringCoreXML.module.Employee;
import com.ojas.SpringCoreXML.module.Sample;

public class EmpTest {
public static void main(String[] args) {
	 ApplicationContext ac = new ClassPathXmlApplicationContext("EmployeeContext.xml");
     Employee emp = (Employee)ac.getBean("empObj");
     System.out.println(emp);
}
}
