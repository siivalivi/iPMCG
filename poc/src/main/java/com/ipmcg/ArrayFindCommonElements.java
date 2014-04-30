package com.ipmcg;


import java.util.Arrays;
import java.util.Vector;

public class ArrayFindCommonElements{


	public Object[] getCommonElements (int[] dataArrayOne, int[] dataArrayTwo){
	
	
		int j = 0;
		if (dataArrayOne == null) return null;
		if (dataArrayTwo == null) return null;
		if ( dataArrayTwo.length == 0 ) return null;
		Vector commonElements = new Vector(); 
		for ( int i = 0; i < dataArrayOne.length; i++){
			if ( Arrays.binarySearch (dataArrayTwo, dataArrayOne[i]) > 0) commonElements.add( dataArrayOne[i]);
		}
		return commonElements.toArray();
	}

}