package day4practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidateID {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter number of Emails you are inputting: ");
		int NoE = s.nextInt();
		
		String emails [] = new String [NoE];
		
		System.out.println("Please input emails so we may verify which are vaild: ");
			for(int i=0; i < emails.length ; i++) {
				emails[i] = sn.nextLine();
			}
		System.out.println("your inputted emails are: \n");
			for(int i=0; i < emails.length ; i++) {
				System.out.println(emails[i]);
			}
		System.out.println("\n");

		//regex test	
		final String regex = ".+\\@.+(\\..+)+";
		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
			
			for(int i=0; i< emails.length ; i++) {
				final Matcher matcher = pattern.matcher(emails[i]);
				while (matcher.find()) {
				    System.out.println("Valid Email: " + matcher.group(0));
				}
			}		
	}
}
