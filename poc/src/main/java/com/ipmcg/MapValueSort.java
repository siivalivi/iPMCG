package com.ipmcg;

 import java.util.HashMap;
 import java.util.Set;
 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Map.Entry;
 import java.util.Comparator;
 import java.util.List;
 import java.util.Map;
 
 
 public class MapValueSort{
 
 	HashMap hm = new HashMap();
 	public MapValueSort(HashMap hmInput){
 		this.hm = hmInput;
 
	 }
	
	 public String toString(){
	 	return hm.toString();
	 }
     public void sortByValue(){
     
     	Set<Map.Entry<String, Integer>> set = hm.entrySet();
     	List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
     /*   for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }*/
     	
     }
 
    
 }