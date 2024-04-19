package Selenium;

public class Reverse_word {

	public static void main(String[] args) {
			String name = "gayatri";
			String reverse="";
			for (int i=name.length()-1;i>=0;i--) 
			{
				char answer= name.charAt(i);
				reverse=reverse+answer;
			}
			
			System.out.println(reverse);
			
	}
	
}
