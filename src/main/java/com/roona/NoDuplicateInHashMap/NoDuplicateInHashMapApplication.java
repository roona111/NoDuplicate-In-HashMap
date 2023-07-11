package com.roona.NoDuplicateInHashMap;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roona.NoDuplicateInHashMap.model.Student;

@SpringBootApplication
public class NoDuplicateInHashMapApplication {

	public static void main(String[] args) {
		Set<Student> studentMap = new HashSet<>();
		studentMap.add(new Student("Roona",101,"ComputerScience"));
		studentMap.add(new Student("Roona",101,"ComputerScience"));
		studentMap.add(new Student("Anju",102,"HM"));
		studentMap.add(new Student("Vicky",103,"BFA"));
		studentMap.add(new Student("Vicky",103,"BFA"));
		studentMap.add(new Student("Archna",104,"English"));
		studentMap.add(new Student("Avinash",105,"BBA"));
		System.out.println(studentMap);
		SpringApplication.run(NoDuplicateInHashMapApplication.class, args);
	}

}
