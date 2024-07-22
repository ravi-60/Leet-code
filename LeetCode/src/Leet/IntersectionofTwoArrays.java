package Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays {

	public static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> a = new HashSet<Integer>();
		int index = 0;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					a.add(nums1[i]);
				}
			}
		}
		if(a.isEmpty()) {
			return null;
		}
		int[] r = new int[a.size()];
		int i = 0;
		for(int i1 : a) {
			r[i++] = i1;
		}
//		int[] al = a.stream().mapToInt(i -> i).toArray();
//		Arrays.sort(al);
//		int[] r = remove(al);
		return r;
	}

//	private static int[] remove(int[] al) {
//		// TODO Auto-generated method stub
//		int index = 0;
//		for (int i = 0; i < al.length - 1; i++) {
//			if(al[i] != al[i + 1]) {
//				al[index++] = al[i];
//			}
//		}
//		al[index++] = al[al.length - 1];
//		int[] r = new int[index];
//		for(int i =0; i<index; i++) {
//			r[i] = al[i];
//		}
//		return r;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {4,3,9,3,1,9,7,6,9,7};
		int[] arr2 = {3,1,8};
		int[] r = intersection(arr1, arr2);
		System.out.println(Arrays.toString(r));
	}

}
