package oopConcepts;

public class AddingMethods {

	public static void main(String[] args) {
		//Student#1
		String studentName = "John";
		
		int score = 90;
		String grade;
	if (score >= 90 && score <= 100) {
		grade = "A";
		
	} else if (score >= 80 && score < 90) {
		grade = "B";
		
	} else if (score >= 70 && score <80) {
	grade = "C";
	
	} else {
		grade = "D";
	}
	
	System.out.println("Grade of  " + studentName + " is: " + grade);
	
	
	
	// Student#2 
	
	String studentName1 = "Steve";
	
	int score1 = 80;
	
	if (score1 >= 90 && score1 <= 100) {
	grade = "A";
	
	} else if (score1 >= 80 && score1 < 90) {
	grade = "B";
	
	} else if (score1 >= 70 && score1 <80) {
		grade = "C";

	} else {
	grade = "D";
	}

	System.out.println("Grade of  " + studentName1 + " is: " + grade);

	// If there are 10 students and you have to write these code for each student will take a lot of time.
	// However, there is a method we can use to save all time code.
	}

}