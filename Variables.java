package Introduction;

public class Variables {

	public static void main(String[] args) {
		/*
		 * Byte
		 * Min: -128
		 * Max: 127
		 * Default: 0
		 */
		byte byteVariable = 100;
		System.out.println("Byte Value: " + byteVariable);
		
		
		/*
		 * Short
		 * Min: -32,768
		 * Max: 32,767
		 * Default: 0
		 */
		short shortVariable = 1000;
		System.out.println("Short Value: " + shortVariable);
		
		
		/*
		 * Int
		 * Min: -2,147,483,648
		 * Max: 2.147.483,647
		 * Default: 0
		 */
		int integerVariable = 100000;
		System.out.println("Integer Value: " + integerVariable);
		
		
	   /*
	     * Long
	     * Min: -2^63
	     * Max:2^63 -1
	     * Default:0
	     */
		
		
	long longVariable = 10000000L;
	System.out.println("Long Value: " + longVariable);
	
	/* 
	 * float
	 * default: 0.0f
	 */
	
	
	float floatVariable = 20.0f;
	System.out.println("Float value: " + floatVariable);
			
	
	
	/*
	 * double
	 * default: 0.0d
	 */
	double doubleVariable = 60.33;
	System.out.println("Double Value: " + doubleVariable);
	
	
	/*
	 * boolean
	 * false and true
	 * default: false
	 */
	
	boolean booleanVariable = true;
	System.out.println("Boolean value: " + booleanVariable);
	
	
	
	/*
	 * char
	 * Min: 0
	 * Max: 65,535
	 */
	
	char charVariable = 'a';
	System.out.println("Char Value: " + charVariable);
	
	}

}
