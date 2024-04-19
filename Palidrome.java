package Selenium;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Palidrome {

	public static void main(String[] args) {
		String name = "radar";
		String reverse="";
		for (int i=name.length()-1;i>=0;i--) 
		{
			char answer= name.charAt(i);
			reverse=reverse+answer;
		} 
		boolean a1= name.equals(reverse);
		System.out.println(a1);
		if (a1==true) 
		{
			System.out.println("The input is palidrome");
		}
		else
		{
			System.out.println("The input is not palidrome");
		}
}

}


	


