package org.ph;

public class Phone {
	private void phoneInfo(long phno) {
	System.out.println("Phone num is "+phno);
	}
	public static void main(String[] args) {
		Phone p= new Phone();
		p.phoneInfo(9876543210l);
	}
}
