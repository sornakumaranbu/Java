package com.string.reverse.com;

public class ReverseString_SpaceConstant {
	
	 static void reverses(String str)
	    {
	 
	        char[] inputArray = str.toCharArray();
	        char[] result = new char[inputArray.length];
	 
	        // Mark spaces in result
	        for (int i = 0; i < inputArray.length; i++) {
	            if (inputArray[i] == ' ') {
	                result[i] = ' ';
	            }
	        }
	 
	        // Traverse input string from beginning
	        // and put characters in result from end
	        int j = result.length - 1;
	        for (int i = 0; i < inputArray.length; i++) {
	 
	            // Ignore spaces in input string
	            if (inputArray[i] != ' ') {
	 
	                // ignore spaces in result.
	                if (result[j] == ' ') {
	                    j--;
	                }
	                result[j] = inputArray[i];
	                j--;
	            }
	        }
	        System.out.println(String.valueOf(result));
	    }
	 
	    // driver function
	    public static void main(String[] args)
	    {
	        reverses("today is a java class at 5 pm");
	    }
	}
	

/*
	static void reverse(String Str) {
		
	}
	
	public static void main(String[] args) {

		String str = "Todays Class is a Java";

		char[] inputArray = str.toCharArray();
		char[] result = new char[inputArray.length];

		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i] == ' ') {
				result[i] = ' ';
			}
		}

		int j = result.length - 1;

		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i] != ' ') {

				if (result[j] == ' ') {
					j--;

				}
				result[j] = inputArray[i];
				j--;

			}
			System.out.println(String.valueOf(result));
		}
		
		reverse(str);
	}

}
*/