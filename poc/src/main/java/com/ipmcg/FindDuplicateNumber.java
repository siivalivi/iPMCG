package com.ipmcg;
//package com.ipmcg.utils;

import java.util.List;
import java.util. ArrayList;

public class FindDuplicateNumber{

     public int getDuplicateNumber( List<Integer> data){

		 int standardTotal = getSeriesTotal (data);
		 int actualTotal = getActualTotal(data);
		 int duplicateValue = actualTotal - standardTotal;
		 return duplicateValue;


     }
     //Private methods
      private int getSeriesTotal ( List<Integer> data){
        // real code goes in here
        return 0;
     }

     private int getActualTotal(List<Integer> data){
      // real code goes in here
      return 0;
     }

	public static void main (String a[]){
		List<Integer> number = new ArrayList<Integer>();
		int duplicateValue = -1;
		int i = 0;
		// Assign series for array
		for ( i = 0; i < 30; i++){
		  number.add(i);
		}
		number.add(22);
		FindDuplicateNumber fdn = new FindDuplicateNumber();
		if ( fdn!= null){
			duplicateValue = fdn.getDuplicateNumber(number);
		}
		System.out.println("Duplicate Valur in the series:" + number.toString() + "is ->" + duplicateValue );
	}
}