package com.rd.test.task21.rdtesttask21.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomSeverity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int count;
	String year;
	String monthYear;
	String Severity;
	
	int low;
	int medium;
	int high;
	int critical;
}
