package com.java.basics;

import org.apache.catalina.filters.ExpiresFilter.XServletOutputStream;

public class CustomExceptionMain {
	
	public static void checkNumber(int number) throws CustomException{
		if(number < 0) {
			throw new CustomException("provided number is negative: " + number);
		}
		else {
		      System.out.println("provided number is positive: " + number);
		}
	}

	public static void main(String[] args) {
		try {
			checkNumber(10);  // positive number
			
			checkNumber(-5);  // negative number

		}
		catch(CustomException e) {
			System.out.println("custom exception error" + e);
		}

	}

}
