package Selenium;
import java.util.HashMap;

	public class CharacterOccurrence 
	{
	    public static void main(String[] args) 
	    {
	        String str = "hello world";
	        HashMap<Character, Integer> charCountMap = new HashMap<>();

	        // Convert the string to char array
	        char[] charArray = str.toCharArray();

	        // Iterate through each character in the array
	        for (char c : charArray) 
	        {
	            // If the character is already present in the map, increment its count
	            if (charCountMap.containsKey(c)) 
	            {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else 
	            {
	                // If the character is not present in the map, add it with count 1
	                charCountMap.put(c, 1);
	            }
	        }
//Display the character count map
	        System.out.println("Character Occurrence in String:");
	        for (char c : charCountMap.keySet()) {
	            System.out.println("'" + c + "' : " + charCountMap.get(c));
	        }
	    }
	}
