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
	int[] output=new int[pos+1];
	for (int i = 0; i <= pos; i++) {
		output[i]=temparr[i];
	}
	return output;
}
public static int[] bubbleSort(int[] intArray){
	
	  /*
     * In bubble sort, we basically traverse the array from first
     * to array_length - 1 position and compare the element with the next one.
     * Element is swapped with the next element if the next element is greater.
     *
     * Bubble sort steps are as follows.
     *
     * 1. Compare array[0] & array[1]
     * 2. If array[0] > array [1] swap it.
     * 3. Compare array[1] & array[2]
     * 4. If array[1] > array[2] swap it.
     * ...
     * 5. Compare array[n-1] & array[n]
     * 6. if [n-1] > array[n] then swap it.
     *
     * After this step we will have largest element at the last index.
     *
     * Repeat the same steps for array[1] to array[n-1]
     *  
     */
   
    int n = intArray.length;
    int temp = 0;
   
    for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                   
                    if(intArray[j-1] > intArray[j]){
                            //swap the elements!
                            temp = intArray[j-1];
                            intArray[j-1] = intArray[j];
                            intArray[j] = temp;
                    }
                   
            }
    }
    return intArray;
}
		
	
}
