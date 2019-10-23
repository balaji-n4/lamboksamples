package com.cts.lamboksamples;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Employee {
	private String name;
    private int age;
    @Builder.Default
    private String team = "CDP POOL";
}
	