package com.gmail.kirovdmitriy;



public class Main {

	public static void main(String[] args) {
		String text = "I can text anything here but who cares?";
		wordCount(text);
	}
	public static void wordCount(String text) {
		int count = text.split(" ").length;
		System.out.println(count);
	}
}
