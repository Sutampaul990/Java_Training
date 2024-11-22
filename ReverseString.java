import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		/*
		String reversed = "";
		for(int i=0;i < str.length();i++) {
			reversed += str.charAt(str.length()-i-1); 
		}
		System.out.print("After reversing : ");
		System.out.println(reversed);
		*/
		
		char [] arr = str.toCharArray();
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		String reversed = new String(arr);
		System.out.print("After reversing : ");
		System.out.println(reversed);
		
	}

}
