package com.ojas.SpringCoreXML.module;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private List skillset;
	private Map projects;
	private Set phone_nos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getSkillset() {
		return skillset;
	}
	public void setSkillset(List skillset) {
		this.skillset = skillset;
	}
	public Map getProjects() {
		return projects;
	}
	public void setProjects(Map projects) {
		this.projects = projects;
	}
	public Set getPhone_nos() {
		return phone_nos;
	}
	public void setPhone_nos(Set phone_nos) {
		this.phone_nos = phone_nos;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", skillset=" + skillset + ", projects=" + projects
				+ ", phone_nos=" + phone_nos + "]";
	}
	
	
}