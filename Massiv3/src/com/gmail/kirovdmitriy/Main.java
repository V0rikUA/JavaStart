package com.gmail.kirovdmitriy;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int a = 15;
		int b = a * 2;
		int[] array2 = new int[b];
		int[] array = new int[a];
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			if (j == 0) {
				j = (int) (Math.random() * 100);
			}
			array[i] = j;
		}

		System.arraycopy(array, 0, array2, 0, array.length);

		for (int i = a; i < array2.length; i++) {
			int x = array2[i];
			if (x == 0) {
				x = array[i - a]*2;
			}
			array2[i]= x;
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
	}

}
