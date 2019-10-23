package com.cts.lamboksamples;

import java.util.List;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

@Builder
@ToString
public class Student {

	private String name;
	
	@Singular
	private List<String> subjects;
}
