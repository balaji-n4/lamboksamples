package com.cts.lamboksamples;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@ToString
public class Animal {

	private String name;
	private String desc;
}
