// Reverse an Array: Write a program to reverse the elements of an integer array.

package MyString;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println("Present array : "); // Printing the given array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println(); // Next line
		
		
		// Printing the array in reverse order
		System.out.println("After reverse : ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + "\t");
		}
        
	}

}
