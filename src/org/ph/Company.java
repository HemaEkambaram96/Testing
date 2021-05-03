
	package org.ph;

	public class Company {
	private void add() throws EmployeeNotFountException  {
		throw new EmployeeNotFountException();

	}
	public static void main(String[] args) throws EmployeeNotFountException {
		Company c=new Company();
	c.add();
	}
	}
	
	
	



