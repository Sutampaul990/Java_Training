import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		int flag = 0;
		
		for(int i=0;i < str.length();i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 0)	System.out.println(str + " is a palindrome...");
		else System.out.println(str + " isn't a palindrome...");
		
	}

}
