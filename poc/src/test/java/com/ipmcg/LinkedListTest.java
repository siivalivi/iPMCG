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


import java.util.Collection;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class LinkedListTest{
    int iListNodeData = -1;
    LinkedList ll = new LinkedList();
    String expectedResults ="";
    int size = -1;
    int firstElement = -1;
    int lastElement = -1;
    int itemRemove = -1;
    String sDataRemoved = "";
    
	public LinkedListTest(String expectedResults, int[] data, int size, int first, int last, int itemRemove, String dataR){
		this.expectedResults = expectedResults;
		for ( int i=0; i < data.length; i++){
			ll.add(data[i]);
		}	
		this.size = size;
		this.firstElement = first;
		this.lastElement = last;	
		this.itemRemove = itemRemove;
		this.sDataRemoved = dataR;
	}
	
	@Before
	public void initialize(){
	}
	
	@Parameterized.Parameters
	public static Collection dataProvider(){
	    int[] iData1 ={10};
	    int[] iData2 = {5,30};
	    int[] iData3 = {100,200,300};
	    String sData1R = "";
	    String sData2R = "5";
	    String sData3R = "100, 300";
	    
		Object[][] data = {{"10",iData1,1, 10,10,1, sData1R},{"5, 30", iData2,2, 5, 30,2, sData2R}, {"100, 200, 300", iData3,3, 100, 300,2, sData3R}};
		
		return Arrays.asList(data);
	
	}
	
	@Test
	//@Ignore
	public void validateListOperations(){
		assertEquals(this.expectedResults, this.ll.toString());
		assertEquals (this.size,  this.ll.size());
		assertEquals ( this.firstElement, ll.getFirst());
		assertEquals (this.lastElement, ll.getLast());
		assertTrue (ll.remove( this.itemRemove));
		assertEquals(this.sDataRemoved, this.ll.toString());
		
	
	}

}