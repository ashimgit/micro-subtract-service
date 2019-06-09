package com.subtract.pojo;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class SubtractPojo {

	private BigDecimal inputOne;
	private BigDecimal inputTwo;
	private String result;
	public SubtractPojo(BigDecimal inputOne, BigDecimal inputTwo, String result) {
		super();
		this.inputOne = inputOne;
		this.inputTwo = inputTwo;
		this.result = result;
	}
	public SubtractPojo() {
		super();
	}
	


}
