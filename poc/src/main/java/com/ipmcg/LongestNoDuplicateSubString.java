package com.ipmcg;

public class LongestNoDuplicateSubString {

	public String getlongestNoDuplicateString(String sourceString){
	    char[] source = sourceString.toCharArray();
	    String subSource ="";
	    String tempString ="";
		for ( int i=0; i < sourceString.length(); i ++){
			if ( tempString.indexOf(source[i]) == -1){
				tempString+= source[i];
			}else{
			  if ( subSource.length() < tempString.length()) {
			  	subSource = tempString;
			  	tempString ="";
			  	tempString += source[i];
			  }
			  
			}
		}
		 if ( subSource.length() < tempString.length()) {
			  	subSource = tempString;
			  	tempString = "";
		}
  		return subSource;
	}
}