package Files;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

class handleMyFile {
	public static void createBook(String bookName) {
		//Creating File to work with
		try {
			File page = new File(bookName);
			if (page.createNewFile()) {
				System.out.println("created Book File: "+ page.getName());
			} else {
				System.out.println("File already exists");
			}
		}
		catch (IOException ex) {
			System.out.println("Error Found");
		}
	}
	
	public static void writeBook(String bookName, String s) {	
			//Write to File
			try {
				FileWriter author = new FileWriter(bookName);
				author.write(s+" ");
				author.close();
				System.out.println("\n");
			}
			catch(IOException e){
				System.out.println("Error Found");
			}
	}
			
	public static void readBook(String bookName) {
		//Read the File
			try {
				File book = new File(bookName);
				Scanner reading = new Scanner(book);
				while (reading.hasNextLine()) {
					String chapter = reading.nextLine();
					System.out.println(chapter);
				}
				reading.close();
				System.out.println("\n");
			}
			catch (FileNotFoundException exo) {
				System.out.println("Error Found");
			}
	
	}
	
	public static void appendBook(String bookName, String s) {
		//Append the File
			try {
				File book = new File(bookName);
				FileWriter bookEntry = new FileWriter(book, true);
				BufferedWriter entry = new BufferedWriter(bookEntry);
				entry.write(s);
				entry.close();
				System.out.println("\n");
			}
			catch (IOException iex) {
				System.out.println("Error Found");
			}
			return;
		}	
	
	
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Scanner snn = new Scanner(System.in);
		
		System.out.println("Hello new Author, What would you like to name your book's file?: ");
		String book = s.nextLine();
		createBook(book);
		
		System.out.println("What would you like to write in "+ book +"?:");
		String words = sn.nextLine();
		writeBook(book, words);
		readBook(book);
		
		System.out.println("What message would you like to append to "+ book + "?:");
		String appendedWords = snn.nextLine();
		appendBook(book, appendedWords);
		readBook(book);
		
	}

}

