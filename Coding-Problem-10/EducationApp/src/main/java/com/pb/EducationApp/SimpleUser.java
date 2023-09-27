package com.pb.EducationApp;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component("simpleUser")
@Scope("prototype")
public class SimpleUser implements User {

	String name;
	String age;
	String location;
	String collegeName;

	@Override
	public String getUserDetails() {
		return this.name + " age:" + this.age;
	}

	@Override
	public void setUserDetails(String name, String age, String location, String collegeName) {
		this.name = name;
		this.age = age;
		this.collegeName = collegeName;
		this.location = location;
	}

}
