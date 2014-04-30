package com.ipmcg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Before;

import java.util.Arrays;
import java.util.Collection;

import java.util.ArrayList;





@RunWith(Parameterized.class)
public class RemoveArrayDuplicatesTest {
   RemoveArrayDuplicates rad = new RemoveArrayDuplicates();
   int sortedArray[];
   int originalLength;
   int noDuplicateLength;
  
  
   
    @Before
    public void initialize() {
     
   }
    public RemoveArrayDuplicatesTest(int sortedArrayIndex,  int noDuplicateLength, int[] sortedArray) {
    
   		this.sortedArray = sortedArray;
    	this.originalLength = sortedArrayIndex;
    	this.noDuplicateLength = noDuplicateLength;
    	rad.setSortedDuplicateArray(this.sortedArray);
   		
   	}
   	
   	@Parameterized.Parameters
   	public static Collection sortedArray(){ 
   	
   	    int arr1[] = {1,2,2,3,40,40,40,50,60,70,70,70};
   	  	int arr2[] = {1,2};
   	  	int arr3[] = {};
   	    Object testdata[][]= {{12,7,arr1},{2,2,arr2},{0,0,arr3}};
   	    return Arrays.asList(testdata);
   	}
   	
     
   @Test
   //@Ignore
   public void createDuplicateArray(){
        
   		assertNotNull (rad.getDuplicateData());
   		assertEquals (originalLength, rad.getDuplicateArrayLength());
   
   }
   @Test
  // @Ignore
   public void removeDuplicate(){
        rad.removeDuplicates();
   		assertNotNull(rad.getNonDuplicateData());
   		assertEquals (noDuplicateLength, rad.getNonDuplicateArrayLength());
   }
    
    
}