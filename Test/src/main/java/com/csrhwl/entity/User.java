package com.csrhwl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private String name;
	private String sex;
	private String hobby;
	private Integer age;
	
	public User(String name, String sex, String hobby) {
		super();
		this.name = name;
		this.sex = sex;
		this.hobby = hobby;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + ", hobby=" + hobby + "]";
	}
	
}
