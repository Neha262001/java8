package com.java;

public class StringOperations {

	public static void main(String[] args) {
         
		String str = "Blue Whale ";
		String str1 = "Blue";
		String str2 = "White";
		String str3 = "  Black  ";
		
		// String length
		System.out.println("Length of the string is:" + str.length());
		// String toUpper case
		System.out.println("Upper case of the string is:" + str.toUpperCase());
		// String toLowercase
		System.out.println("Length of the string is:" + str.toLowerCase());
		// String equals
		System.out.println("Both the strings are equal:" + str.equals(str1));
		// String equalsIgnoreCaes
		System.out.println("Both the strings are equal:" + str.equalsIgnoreCase(str1));
		// String replace
		System.out.println("replace of the string is:" + str.replace("White","Blue"));
		// String concatIn
		System.out.println("Concatination of the string is:" + str1.concat("Eyes"));
		// String indexOf
		System.out.println("Index of  character l is:" + str.indexOf('l'));
		// String lastindexOf
		System.out.println("Last index of W is:" + str.lastIndexOf('W'));
		// String contains
		System.out.println("String contains p:" + str.contains("p"));
		// String Substring
		System.out.println("Substring of the string is:" + str.substring(1,3));
		// String trim
		System.out.println("trim:" + str3.trim());
		String str4 = str3.trim();
		System.out.println("Length of the string is:" + str4.length());
		// String split 
		String str5 = "what do you do";
		String arrStr[] = str5.split(" ", 3);
		System.out.println("Splitted elements");
		for (int i = 0; i<arrStr.length;i++) {
		
			System.out.println(arrStr[i] + " ");

		}
		String str7 = " ";
		// String length
		System.out.println("Length of the string is:" + str7.length());
		// String empty
		System.out.println("given string is empty: " + str7.isEmpty());
		// String blank
      	System.out.println("given string is blank : " + str7.isBlank());
       // String compareToIgnoreCase
     	System.out.println("java".compareToIgnoreCase("PYTHON"));




	


		
		




		


		





	}

}
