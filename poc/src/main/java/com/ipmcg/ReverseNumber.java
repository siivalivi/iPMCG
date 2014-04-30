package com.ipmcg;

public class ReverseNumber{

	public int getReversedNumber (int iData){
		Integer iTemp = new Integer(0);
		String sTemp;
		iTemp = new Integer (iData);
		sTemp = iTemp.toString();
		ReverseString rs = new ReverseString();
		sTemp = rs.getReversedString(sTemp);
		iTemp = new Integer(sTemp);
		return iTemp.intValue();


	}

	public static void main(String a[]){
		ReverseNumber rn = new ReverseNumber();
		int number = 234567989;
		int reversedNumber =-1;
		reversedNumber = rn.getReversedNumber(number);
		System.out.println( "Orginal Number: " + number + " Reveersed Number: " + reversedNumber);

	}
}