package Selenium;

public class RemoveVowels 
{
	public static void main(String[] args) 
	{
	       String str = "Hello, World!";
	        // Convert the string to lowercase for easier comparison
	        str = str.toLowerCase();
	        // Remove vowels using StringBuilder
	        StringBuilder result = new StringBuilder();
	        for (char c : str.toCharArray()) 
	        {
	            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
	                result.append(c);
	        }
	        // Print the modified string without vowels
	        System.out.println("String after removing vowels: " + result.toString());
	    }
	}

}
