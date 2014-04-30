
package com.ipmcg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import java.util.Collection;
import java.util.Arrays;
import java.util.LinkedList;

@RunWith(Parameterized.class) 
public class AddLinkListTest{
    String[] firstInput;
    String[] secondInput;
    String[] expectedResults;
    AddLinkLists all = new AddLinkLists();

	public AddLinkListTest(String[] first, String[] second, String[] expected){
		this.firstInput = first;
		this.secondInput = second;
		this.expectedResults = expected;
	
	}
	
	@Before
	public void initialize(){
	}
	
	
	@Parameterized.Parameters
	public  static Collection getData(){
	    String[] first = {"2","4","3"};
	    String[] second = {"5","6","4"};
	    String[] expected =  {"7","0","8"};
		Object[][] data = {{first,second,expected}};
		return Arrays.asList(data);
	
	}
    @Test

    public void addLists(){
      all.createTwoLinkLists(this.firstInput, this.secondInput);
      LinkedList ll = all.addTwoLinkedLists();
      assertEquals (Arrays.toString(this.expectedResults), Arrays.toString(ll.toArray()));
      //assertTrue(true);
    }	

}