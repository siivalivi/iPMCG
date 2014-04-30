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


import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

@RunWith(Parameterized.class) 
public class LongestNoDuplicateSubStringTest{
   String sourceString;
   String longestString;
   LongestNoDuplicateSubString lnds = new LongestNoDuplicateSubString();

  	@Before
	public void initialize() {
     
    }
    public LongestNoDuplicateSubStringTest(String sourceString,  String longestString) {    
   		this.sourceString = sourceString;
   		this.longestString = longestString;   		
   	}
   	
   	@Parameterized.Parameters
   	public static Collection StringData(){ 
   	    Object testdata[][]= {{"Thisismynewcariboughtitlongtimeago", "ismynewcar"}};
   	    return Arrays.asList(testdata);
   	}
   	
   	@Test
   	@Ignore
   	public void validateSubString(){
   		String longest = lnds.getlongestNoDuplicateString(this.sourceString);
   		assertEquals ( this.longestString,longest);
   	
   	}

}