package com.ipmcg;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.Iterator;

public class AddLinkLists{
    LinkedList ll1 = new LinkedList();
    LinkedList ll2 = new LinkedList();
    LinkedList ll3  = new  LinkedList();
    boolean b;

	public void createTwoLinkLists ( String[] ll1, String[] ll2){
	   
	    for (int i = 0; i < ll1.length; i++)
			b = this.ll1.add(ll1[i]);
		for (int i = 0; i < ll2.length; i++)	
			b = this.ll2.add(ll2[i]);
	}
	
	public LinkedList addTwoLinkedLists(){
	     LinkedList ll = new LinkedList();
	     ListIterator lt1 = this.ll1.listIterator();
	     ListIterator lt2 = this.ll2.listIterator();
	     int MaxLoop = 0;
	     int digit_one;
	     int digit_two;
	     int digit_total = 0;
	     int reminder = 0;
	     //Identify which has more digits
	     if (this.ll1.size() > this.ll1.size())
	     	MaxLoop = this.ll1.size();
	     else MaxLoop = this.ll2.size();
	     for ( int i = 0; i < MaxLoop; i++){
	       if ( lt1.hasNext()) digit_one = Integer.parseInt((String)lt1.next());
	       else digit_one =0;
	       if ( lt2.hasNext()) digit_two = Integer.parseInt((String)lt2.next());
	       else digit_two =0;
	 
	       digit_total = digit_one + digit_two + reminder;
	
	       reminder = 0;
	       if ( digit_total > 9){ 
	       		digit_total = digit_total - 10;
	       		reminder = 1;
	       	}
	    
	       ll.add(digit_total);
	        
	     }//end for
	  
	     return ll;
	 
	}

}