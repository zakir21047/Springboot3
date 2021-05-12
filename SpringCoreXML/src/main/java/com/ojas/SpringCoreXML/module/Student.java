package com.ojas.SpringCoreXML.module;

import org.springframework.stereotype.Component;

@Component
public class Student {

	String sname;

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String dispName() {
		return "Hello " + sname;
	}
}

