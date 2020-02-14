package com.os;

class InvalidInputException extends Exception {
	public InvalidInputException(String s) {
		System.out.println(s);
	}
}

public class InvalidInput implements Os  {
	
	public void display() {
		try {
			throw new InvalidInputException("Invalid Input");
			
		}catch(InvalidInputException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	
	
}
