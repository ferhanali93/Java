package Introduction;

import java.util.Arrays;

public class ArraysDemo {
	

// The shortcut to create the main class is to type the word main control+space it will automatically gives you.
	public static void main(String[] args) {
		
		int[] myIntArray1; // <-- This is just the reference to an array. we haven't created the array yet.
		
// To create Array: Look below. The word new will create an array. It will reserve space in my computer that can hold 10 integer value.
		myIntArray1 = new int[10];
		
//Giving Values to arrays below:
		myIntArray1[0] = 100;
		myIntArray1[1] = 90;
		myIntArray1[2] = 75;
		
	System.out.println("Zero Index: " + myIntArray1[0]);
	System.out.println("1st Index: " + myIntArray1[1]);
	System.out.println("2nd Index: " + myIntArray1[2]);
	
	String[] myStringArray1 = {"bmw", "audi", "honda"};
	System.out.println("Zero Index: " + myStringArray1[0]);
	System.out.println("1st Index: " + myStringArray1[1]);
	System.out.println("2nd Index: " + myStringArray1[2]);
	
	// how to find the length of the array?
	int len1 = myIntArray1.length;
	int len2 = myStringArray1.length;
	System.out.println("Int array length: " + len1);
	System.out.println("String array length: " + len2);

	
	// Sorting an array
	
	for (int i = 0; i < len1; i++){
		System.out.println(myIntArray1[i]);
	}
	
	Arrays.sort(myIntArray1);
	for (int i = 0; i < len1; i++) {
		System.out.println(myIntArray1[i]);
	}
	}
	}
	
	

