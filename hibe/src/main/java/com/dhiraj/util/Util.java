package com.dhiraj.util;

import java.util.Arrays;


public class Util {
	
public static int[] removeDuplicate(int[] arr){
	if(arr == null || arr.length==0 || !(arr instanceof int[])){
		throw new IllegalArgumentException("array is null or no elements");
	}
	int len=arr.length;
	int[] temparr=new int[len];
	temparr[0]=arr[0];
	int pos=0;
	for (int i = 0,count=0; i < arr.length; i++) {
		count=0;
		for (int j = 0; j <= pos;j++ ) {
			if(temparr[j]==arr[i]){
				count++;
				break;
			}
		}
		if(count==0){
		temparr[++pos]=arr[i];
		}
	}
	System.out.println(Arrays.toString(temparr));
	int[] output=new int[pos+1];
	for (int i = 0; i <= pos; i++) {
		output[i]=temparr[i];
	}
	return output;
}
public static void removeDuplicate(){
	
}
}
