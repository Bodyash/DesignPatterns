package com;

public class Main {

	public static void main(String[] args) {
		
		final Image IMAGE1 = new ProxyImage("Photo_1_10MB");
		final Image IMAGE2 = new ProxyImage("Photo_2_10MB");
		
		IMAGE1.displayImage();
		IMAGE1.displayImage();
		
		IMAGE2.displayImage();
		IMAGE2.displayImage();
		
		IMAGE1.displayImage();
	}

}
