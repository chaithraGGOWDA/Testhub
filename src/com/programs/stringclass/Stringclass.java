package com.programs.stringclass;

public class Stringclass {
	public static void main(String[] args) {
		String s1="DRAMA";
		String ref=s1.toLowerCase();
		System.out.println(ref);
		String s2="dream";
		String ref1=s2.toUpperCase();
		System.out.println(ref1);
		String s3="chaithrag";
		int ref3=s3.indexOf('g');
		System.out.println(ref3);
		int ref4=s3.indexOf('h',4);
		System.out.println(ref4);
		boolean ref5=s3.startsWith("chaithrag");
		System.out.println(ref5);
		boolean ref6=s1.endsWith("dream");
		System.out.println(ref6);
		String ref7=s3.substring(3,8);
		System.out.println(ref7);
		String ref10=s1.substring(1);
		System.out.println(ref10);
		String ref9=s3.replace('c','C');;
		System.out.println(ref9);
		
		
	}
}