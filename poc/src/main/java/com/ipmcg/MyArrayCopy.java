package com.ipmcg;

import java.util.Arrays;

public class MyArrayCopy <T> {
     T original[];
     T copied[];
     int arraySize = 5;
     
     MyArrayCopy(){
  
      original = (T[])new Object[arraySize];
      copied= (T[])new Object[arraySize-2];
     }
     
    public T[] getOriginalArray(){
    	return original;
    }
    public T[] getCopiedArray(){
    	return copied;
    }
    
    public void createArray ( T[] data){
    	/*for ( int i=0; i < arraySize; i++){
    	
    		original[i] = (T)new Object(i*2 + i);
    	}*/
    	original = Arrays.copyOf(data,data.length);
    	
    }
    public void copyArray(){
    	copied = Arrays.copyOf(original,arraySize);
    }
    public int getMyArraysize(){
    	return arraySize;
    }
    public boolean areBothEqual(){
       return (Arrays.deepEquals(original, copied));
    }
    public static void main(String a[]){
         
       /* Integer[] myArr = {2,4,2,4,5,6,3};
        System.out.println("Array size before copy: "+myArr.length);
        Integer[] newArr = Arrays.copyOf(myArr, 10);
        System.out.println("New array size after copying: "+newArr.length);*/
    }
}