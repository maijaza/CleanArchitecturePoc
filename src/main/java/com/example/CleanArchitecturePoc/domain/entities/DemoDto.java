package com.example.CleanArchitecturePoc.domain.entities;

import lombok.Data;

@Data
public class DemoDto {

	private int id;
	private String name;
	private int age;
	
	public String toString() {
		return "I'am " + name + ", and " + this.getAge() + " years old.";
	}
}
