package org.phone;

public class PhoneInfo {
	private void phoneName() {
	System.out.println("Phne Name");
	}
	private void camera() {
	System.out.println("camera");
	}
	private void osName() {
	System.out.println("Os");
	}
	public static void main(String[] args) {
		PhoneInfo a= new PhoneInfo();
		a.phoneName();
		a.camera();
		a.osName();
	}
}
