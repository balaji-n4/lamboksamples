package com.cts.lamboksamples;

import lombok.Builder;
import lombok.ToString;

@ToString
public class Stud2 {
	
	private String name;
    private int age;
    private String section;
    private String school;
   
    public Stud2(String name, int age, String school, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
        this.school = school;
    }
    
    @Builder
    public static Stud2 createStudent(String name, int age, String school) {
        return new Stud2(name, age, school, "");
    }

}

