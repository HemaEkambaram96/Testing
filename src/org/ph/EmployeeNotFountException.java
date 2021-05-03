package org.ph;

public class EmployeeNotFountException extends Exception{
	@Override
	public String getMessage() {
		String msg="not found";
		return msg;
	}
	
	

}
