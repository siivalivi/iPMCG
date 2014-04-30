package com.ipmcg;

public class MySingleton{
	private static MySingleton mysingleton = null;
	static{
		 mysingleton = new MySingleton();
	 }
	MySingleton(){
		System.out.println(" Object getting instantiated");
	}
	public static MySingleton getInstance (){
		return mysingleton;
	}
	public String getFunyGoogleString(){
		return ("Hello Google I am working");
	}

	// Main method to test it
	public static void main ( String a[]){
		MySingleton myinstance_FirstTime = MySingleton.getInstance();
		System.out.println (myinstance_FirstTime.getFunyGoogleString());
		MySingleton myinstance_SeconTime = MySingleton.getInstance();
		System.out.println (myinstance_SeconTime.getFunyGoogleString());
	}
}