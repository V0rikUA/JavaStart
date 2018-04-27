package com.gmail.kirovdmitriy;

public class Main {

	public static void main(String[] args) {
		int a = 45;
		String string = "Hello this F*king World";
		double b = 45.2;
		connect(a, string, b);
		
	}
	public static void connect(int a, String string, double b) {
		double sum = a+b;
		System.out.println(string+" "+sum);
	}
		
	
}
