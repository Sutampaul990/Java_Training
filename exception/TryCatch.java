package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		try {
			/*
			FileReader fr = new FileReader("abc.txt");
			//add(13,23);
			*/
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter : ");
			int n = sc.nextInt();
			int calc = 20/n;
			System.out.println("After calculation : " + calc);
		}
		catch(Exception e) {
			System.out.println(e);
			//System.out.println(fe.getMessage());
			//fe.printStackTrace();
			//System.out.println(fe);
			//System.out.println("abc.txt File doesn't exist.Please check..");
		}
		System.out.println("Terminated successfully...");
	}

}
