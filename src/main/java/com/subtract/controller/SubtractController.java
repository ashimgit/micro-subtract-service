package com.subtract.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subtract.pojo.SubtractPojo;

@RestController
@RequestMapping(path="/subtract")
public class SubtractController {

	@GetMapping(path="/do/{inputOne}/{inputTwo}")
	public SubtractPojo getSubtractResult(@PathVariable("inputOne") final BigDecimal inputOne, @PathVariable("inputTwo") final BigDecimal inputTwo) {
		System.out.println("SubtractController :: getSubtractResult :: From Path Variable inputOne = "+inputOne+" , inputTwo= "+inputTwo);
		
		
		return new SubtractPojo(inputOne,inputTwo,"After Subtraction of "+inputOne+" And "+inputTwo+" , the result is = "+(inputOne.subtract(inputTwo)));
	}

}
