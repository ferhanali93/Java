package Introduction;

public class StringMethods {

	public static void main(String[] args) {
	String str = "This is the test string";
	
	String str1 = "Hello";
	String str2 = "Hello";
	String str3 = "Welcome";
	String str4 = "";
	String str5 = " Spaces all around     ";
	String str6 = "Hello";
			
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
System.out.println(str.indexOf('h')); // It will show 1 in the console because there is only one 'h' in the string.
System.out.println(str.indexOf('q')); // it will show -1 in the console because there is no 'q' in the string.


//String isEmpty: Checks if this string is empty.
System.out.println(str.isEmpty()); // It will show false because, the string is not empty. let me create an empty string(str4) to test it.
System.out.println(str4.isEmpty());// It will show true because, string4 is empty.


//String replace: Returns a string replacing all the older char to new char.
System.out.println(str6.replace('e', 'a')); // we replace a letter 'e' with a letter 'a' in the word "Hello" in string str6.


//String subString: Returns a part of the string.
System.out.println("substring Example 1: " + str.substring(5)); //it will basically print after the 5th index. In this case the word "this" has been replaced.
System.out.println("Substring Example 2: " + str.substring(5, 10));



//String toCharArray: Convert this string into character array.
char[] charArray = str.toCharArray();
for (int i= 0; i<charArray.length; i++) {
System.out.println("Index " + i + "is: " + charArray[i]);
}

//String toLowerCase: Convert the string in the lower-case letter.
System.out.println("Lower case: " + str.toLowerCase());


//String toUpperCase: Convert the string in the upper-case letter. 
System.out.println("Upper Case: " + str.toUpperCase());

//String trim: Eliminating leading and trailing spaces. basically if you have extra spaces in your string, it will trim it out.
// example: "   we are humans      "; after using trim, it will remove the spaces around and print it as "we are human" 
System.out.println(str5.trim());
	
	

	}

}
