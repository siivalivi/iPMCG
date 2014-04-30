package com.ipmcg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MyArrayListTest {

    @Test
    public void ArrayListAdd(){
        MyArrayList mal = new MyArrayList();
        if ( mal !=null){    
       	 	mal.add((Object)new Integer(30));
        	assertEquals(1, mal.size());
        	
        }
    }
}