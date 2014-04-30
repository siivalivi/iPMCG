package com.ipmcg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.HashMap;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Arrays;

 @RunWith(Parameterized.class)
 public class MapValueSortTest{
    HashMap hmSort = new HashMap();
    HashMap hmSorted = new HashMap();
    MapValueSort mvs;
 	public MapValueSortTest(String sortFileName, String  sortedFileName){
 		hmSort = transferTextFileToHashMap(sortFileName);
 		hmSorted = transferTextFileToHashMap(sortFileName);
 	
 	}
 	
 	@Before
	public void initialize(){
	}
	
	@Parameterized.Parameters
	public static Collection dataProvider(){
	
		Object[][] oData = {{"./data/sortFileOne.txt","./data/sortedFileOne.txt"},{"./data/sortFileTwo.txt", "./data/sortedFileTwo.txt"},{"./data/sortFileThree.txt","./data/sortedFileThree.txt"}};
		return Arrays.asList(oData);
	
	}
 	
 	@Test
 	public void validateSort(){
 		mvs = new MapValueSort(hmSort);
 		mvs.sortByValue();
 		assertEquals(hmSorted.toString(), mvs.toString());
 	
 	
 	}
 	
 	private HashMap transferTextFileToHashMap(String filename){
 	HashMap tmpHm = new HashMap();
 	FileReader fr = null;
 	try{
 		
 			fr  = new FileReader(filename);
 			BufferedReader br = new BufferedReader (fr);
 			String lineData = "";
 			String key;
 			String value;
 			while( (lineData = br.readLine()) != null){
 				key = lineData.substring (0, lineData.indexOf(","));
 				value = lineData.substring (lineData.indexOf(",")+1);
 				tmpHm.put( key, new Integer(value.trim()));
 			
 			}
 			fr.close();
 		}catch(FileNotFoundException e){
 			System.out.println(e.getMessage());
 			
 		}catch(IOException e){
 			System.out.println(e.getMessage());
 			
 		}
 		//System.out.println(tmpHm.toString());
 	
 	    return tmpHm;
 	
 	}
 
 }