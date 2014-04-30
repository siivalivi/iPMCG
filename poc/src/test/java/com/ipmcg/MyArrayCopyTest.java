package com.ipmcg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class MyArrayCopyTest {
   
   MyArrayCopy mac = new MyArrayCopy<Integer>();
     
   @Test
   //@Ignore
   public void createArray(){
        Integer arr[] = {1,2,3,4,5};
   		mac.createArray(arr);
   		assertNotNull (mac.getOriginalArray());
   		assertEquals (mac.getMyArraysize(), mac.getOriginalArray().length);
   
   }
   @Test
   //@Ignore
   public void copyArray(){
        assertFalse(mac.areBothEqual());
   		mac.copyArray();
   		assertNotNull(mac.getCopiedArray());
   		assertEquals (mac.getOriginalArray().length, mac.getCopiedArray().length);
   		assertTrue ( mac.areBothEqual());
   }
    
    
}