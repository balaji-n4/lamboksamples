package com.cts.lamboksamples;

import lombok.Builder;
import lombok.ToString;

@ToString
public class Stud {
	
	private String name;
    private int age;
    private String section;
    private String school;
   
    @Builder
    public Stud(String section, String school) {
        this.section = section;
        this.school = school;
    }

}

