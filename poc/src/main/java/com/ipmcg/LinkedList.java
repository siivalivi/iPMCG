package com.ipmcg;

import java.util.StringTokenizer;
import java.util.Vector;

public class LinkedList{
     Node node = null;

	public LinkedList(){
	}
	
	public void add( int value){
		Node addNode = new Node();
		addNode.value = value;
		addNode.next = null;
		if ( node == null ) node = addNode;
		else{
			addNode.next = node;
		 	node = addNode;
		}
	}
	public int size(){
		Node tempNode = node;
		int size = 0;
		while (tempNode !=null) {
			size++;
			tempNode = tempNode.next;
			
		}
		return size;
	}
	public int getFirst(){
	   if ( node == null ) return -1;
	   Node  tmpNode = node;
	   while (tmpNode.next !=null) {		  
			tmpNode = tmpNode.next;			
		}
		return tmpNode.value;
	}
	 
	public int getLast(){
	    if (node == null ) return -1;
		return node.value;
	}
	public void removeLast(){
		if ( node !=  null ){
			Node tmpNode = node;
			node = tmpNode.next;
		}
	}
	public boolean remove (int index){
		Node tmpNode = node;
		if ( node == null ) return false;
		if ( size() < index ) return false;
		Object[] oData = toArray();
		int i =0;
		int currentSize = size();
		//since the items are organized in the reverse order,  align the index with array organization
		index = currentSize - index;
        for ( i = index ; i < currentSize-1; i ++){
        	oData[i++] = oData [i];
        }		
		node = null;
		if ( oData[0] == null) return true;
		for ( i = oData.length - 2; i >=0; i--){
			add (Integer.parseInt(oData[i].toString()));
		}
		return true;
	
	
	}
	public String toString(){
		StringBuffer sb = new StringBuffer();
		int i = 0;
		Object[] oData = toArray();
		for ( i = oData.length -1; i > -1;  i--){
			if (sb.length() >0) sb.append (", ");
			sb.append( oData[i].toString());
		    
		}
	//	System.out.println( "Inside toString(): Elements in the LinkedList :" + sb.toString());
		return sb.toString();
	
	}
	private Object[] toArray(){
	
		Node tempNode = node;
		Vector data = new Vector();
		int i = 0;
		while (tempNode !=null) {		  
			data.add(String.valueOf(tempNode.value));;
			tempNode = tempNode.next;			
		}
	  
        Object[] oData = data.toArray();
		return oData;
	}
}
