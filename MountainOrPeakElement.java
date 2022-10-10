package com.practise.datastructuresandalgorithms;

public class MountainOrPeakElement {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,1};
    	int peak=peakIndexInMountainArray(arr);
    	System.out.println(peak);
	}

	private static int peakIndexInMountainArray(int[] arr) {
		int start=0;
		int end=arr.length-1;
		int mid=start+(end-start)/2;
		while(start<end) {
			if(arr[mid]>arr[mid+1]) {
				end=mid;
				break;
			} else {
				mid=mid+1;
			}
		}

		return end;
	}

}
