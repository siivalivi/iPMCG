package com.ipmcg;

public class ReverseString{

	public String getReversedString(String data){
		String reversedString = null;
		char[] cSourcedata;
		char[] cReversedSourceData;
		char temp ='a';

		// logic begins here
		cSourcedata = data.toCharArray();
        cReversedSourceData = recursiveReverse(cSourcedata, 0, data.length()-1, temp);
        reversedString = new String (cReversedSourceData);
		// logic ends here
		return reversedString;
	}
	private char[] recursiveReverse (char[] data, int start, int end, char temp){
		temp = data[start];
		data[start++] = data[end];
		data[end--] = temp;
		if (start < end) recursiveReverse (data, start, end,temp);
		return data;
	}

	public static void  main (String a[]){

		ReverseString rs = new ReverseString();
		System.out.println( rs.getReversedString ("Google"));
	}

}
