package com.ipmcg;

public class MyArrayList{
   private Object arrayObject[] ;
   private int size = 0;
   private int initialSize = 100;
  
    MyArrayList(){
		arrayObject = new Object[initialSize];
		
	}
	//Public Methods
	// Add an element to the list
	public void add (Object data){
 		
		arrayObject[size++] = data;
	}
	// remove the last element form the list
	public void remove(){
		arrayObject[size--] = null;
	}

	// get the size of the array
	public int size(){
		//int size = -1;
		return size;
	}

	// void clear all elements
	public void clear(){

	}
	public static void main ( String a[]){
	}

}