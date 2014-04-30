package com.ipmcg;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class FindMiddleIndex {

	public int getMiddleIndex( List<Integer> data){
		int middleIndex = -1;
		int overallsum = getOverallSum(data);
		middleIndex = getIndexHalfway (data, overallsum);
		return middleIndex;
	}
	// Private methods
	private int getOverallSum(List<Integer> data){
		int sum = -1;
		Integer dataValue;
		Iterator iterator;
		iterator = data.iterator();
		while (iterator.hasNext()){
			dataValue = (Integer)iterator.next();
			sum += dataValue.intValue();
		}

		return sum;

	}

	private int getIndexHalfway(List<Integer> data, int totalSum){
		int index = -1;

		return index;
	}

	//Main method
	public static void main (String a[]){
		//Prepare the data
		List<Integer> data = new ArrayList<Integer>();
		for ( int i =0; i < 25; i++){
			data.add(i);
		}

		//Instansiate class and invoke the functions
		FindMiddleIndex fmi = new FindMiddleIndex();
		int middleIndex  = fmi.getMiddleIndex(data);
		System.out.println("Middle Index Of :" + data.toString() + "is->" + middleIndex);
	}

}