package com.roona.NoDuplicateInHashMap.model;

import java.util.Objects;

public class Student {

	private String name;
	private int roll;
	private String course;

	public Student(String name, int roll, String course) {
		super();
		this.name = name;
		this.roll = roll;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name,roll,course);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Student student = (Student) obj;
		boolean result = Objects.equals(name, student.name) && Objects.equals(roll, student.roll)
				&& Objects.equals(course, student.course);
		return result;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", course=" + course + "]";
	}

}
