package com.gmail.kirovdmitriy;

public class Main {

	public static void main(String[] args) {
		int a = 46;
		int[] array = new int[] { 5, 45, 6, 8, 10, 46, 86, 44 };
		search(array, a);
	}

	public static void search(int[] array, int a) {
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			if (j == a) {
				System.out.println(i);
				break;
			} else if (j != a && i == array.length - 1) {
				System.out.println("-1");
			}

		}
	}
}
