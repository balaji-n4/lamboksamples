package com.cts.lamboksamples;

import java.util.ArrayList;
import java.util.List;

public class LambokImpl {

	public static void main(String[] args) {
		// @Builder
		Animal tiger = Animal.builder().name("tiger").desc("wild animal").build();
		System.out.println(tiger.toString());

		// @Builder.default
		Employee empDefault = Employee.builder().name("ram").age(28).build();
		System.out.println(empDefault);
		Employee employee = Employee.builder().name("ram").age(28).team("SAP").build();
		System.out.println(employee);
		
		//Singular
		Student calssX = Student.builder().name("Chirant").subject("Kannada").build();
		List<String> subjects = new ArrayList<String>();
		subjects.add("English");
		subjects.add("Kannada");
		Student calssXI = Student.builder().name("Chirant").subjects(subjects).build();
		System.out.println(calssX);
		System.out.println(calssXI);
		
		Stud stud = Stud.builder().school("KV").build();
		System.out.println(stud);
		
		Stud2 stud2 = Stud2.builder().name("ABC").school("KV").build();
		System.out.println(stud2);
	}
	

}
