package com.lara;

public class Me {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";

		System.out.println(s1 == s2); //true
		System.out.println(s2.equals(s2));//true
		System.out.println(s1.hashCode());//same
		System.out.println(s2.hashCode());//same
		System.out.println(s1.length());//3
		System.out.println(s2.length());//3

		System.out.println("---------------");

		String s3 = "xyz";
		String s4 = "abc";

		System.out.println(s3 == s4);//false
		System.out.println(s3.equals(s4));//false
		System.out.println(s3.hashCode());//not same
		System.out.println(s4.hashCode());//not same
System.out.println("==========================");
		String s5 = new String("abc");
		String s6 = "abc";
		System.out.println(s5 == s6);//false
		System.out.println(s5.hashCode());//same
		System.out.println(s6.hashCode());//same
		System.out.println(s5.equals(s6));//true

	}

}
