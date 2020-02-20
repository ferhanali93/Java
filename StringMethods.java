package Introduction;

public class StringMethods {

	public static void main(String[] args) {
	String str = "This is the test string";
	
	String str1 = "Hello";
	String str2 = "Hello";
	String str3 = "Welcome";
			
	//String length: length of the string
System.out.println(str.length());

//String ChartAt: eturns a char value at the given index number
System.out.println(str.charAt(2));

//String COncat: Combines specified string at the end of this string
System.out.println(str.concat(" This is the appended string"));

//String contains: Returns true if chars are found in the string.
System.out.println(str.contains("is")); //True because we have 'is' in string str = "This is the test string"
System.out.println(str.contains("si")); //false because we don't have  'si' in string str = "This is the test string"

//String equals: compares the contents of the two given strings
System.out.println(str1.equals(str2));


//String startsWith: checks if this string starts with a given suffix
System.out.println(str.startsWith("This")); //True--> because our string start with "This"
System.out.println(str.startsWith("is")); //False--> Because our string does not start with "is"

//String endWith: checks if this string ends with a given suffix
System.out.println(str.endsWith("string")); //True--> because our string ends with "string" in the sentence.
System.out.println(str.endsWith("the")); //False--> because our string does not end "the" in the sentence.


//String index: Retruns index of given character value or substring.
System.out.println(str.indexOf('h'));


//String isEmpty: Checks if this string is empty.


//String replace: Returns a string replacing all the older char to new char


//String subString: Returns a part of the string.


//String toCharArray: Convert this string into character array.


//String toLowerCase: Returns the sring in the lowercse letter.


//String toUpperCase: Returns the strinf in the uppercase letter.


//String trim: Eliminating leading and trailing speaces.
	
	
	
	}

}
