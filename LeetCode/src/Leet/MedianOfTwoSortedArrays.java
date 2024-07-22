package Leet;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 3 };
		int[] arr2 = { 2, 4 };
		int[] newArr = new int[arr1.length + arr2.length];
		int index = 0;
		for(int i : arr1) {
			newArr[index++]=i;
		}
		for(int i : arr2) {
			newArr[index++]=i;
		}
		Arrays.sort(newArr);
		if (newArr.length % 2 == 0) {
			double r1 = newArr[(newArr.length / 2) - 1];
			double r2 = newArr[newArr.length / 2];
			double r = (r1 + r2) / 2;
			System.out.println(r);
		} else {
			double r = newArr[newArr.length / 2];
			System.out.println(r);
		}
	}

}
