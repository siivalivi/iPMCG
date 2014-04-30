package com.ipmcg;

import java.util.Arrays;

public class RemoveArrayDuplicates{
    int data[], noduplicateData[];
	public void setSortedDuplicateArray(int [] sortedArray){
		data = sortedArray;
		noduplicateData = new int[data.length];
	}
	public void removeDuplicates(){
	  int currentIndex =0;
	  int nextIndex = 1;
	  int noDuplicateIndex = 0;
   	  for ( int i= 0; i < data.length; i++){
	   		currentIndex = i;
	   		nextIndex = i + 1;
	   		noduplicateData[noDuplicateIndex++] = data[currentIndex];
	   		while( nextIndex < data.length && data[currentIndex] == data[nextIndex++]){
	   			i++;
	   		} //end while
	   	 //Reduce the size of the array to trim the empty values
	  
	  	}//end for
	  	 noduplicateData = Arrays.copyOf (noduplicateData, noDuplicateIndex);
	
	 }  
	public int[] getNonDuplicateData(){
		return noduplicateData;
	}
	public int[] getDuplicateData(){
		return data;
	}
	public int getDuplicateArrayLength(){
			return data.length;
	}
	public int getNonDuplicateArrayLength(){
			return noduplicateData.length;
	}
}
