/**
 * 
 */
package com.rd.test.task21.rdtesttask21.domain;

import lombok.Data;

/**
 * @author hemak
 *
 */
@Data
public class ChartSeverity {
	String month;
	int year, low, medium ,high, critical;

	public ChartSeverity(String month, int year, int low, int medium, int high, int critical) {
		super();
		this.month = month;
		this.year = year;
		this.low = low;
		this.medium = medium;
		this.high = high;
		this.critical = critical;
	}
	
	
}
