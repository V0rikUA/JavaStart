package com.gmail.kirovdmitriy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arraysNumbers = new int[] {5,6,4,8,5,2,4,15,100};
		System.out.println(maxNumber(arraysNumbers));

	}

	public static int maxNumber(int[] arraysNumber) {
		int a = 0;
		for (int i = 0; i < arraysNumber.length; i++) {
			int j = arraysNumber[i];
			if (j > a) {
				a = j;
			}

		}
		return a;
	}

}
