
public class IndexAlphabet {

	public static void main(String[] args) {
		
		String str = "The quick brown fox jumps over the lazy dog";
		
		// Removing all spaces & covert all the letter into lowerCase...
		str = str.toLowerCase();
		System.out.print("Given string : ");
		System.out.println(str);
		
		for(char ch='a';ch <= 'z';ch++) {
			int index = str.indexOf(ch);
			
			if(index != -1) System.out.println("Character : "+ ch + " found at : "+ index);
			else System.out.println("Character : "+ ch + " not found in the String...");
		}
		
	}

}

/*
 * OUTPUT :
 * 
 * Given string : the quick brown fox jumps over the lazy dog
Character : a found at : 36
Character : b found at : 10
Character : c found at : 7
Character : d found at : 40
Character : e found at : 2
Character : f found at : 16
Character : g found at : 42
Character : h found at : 1
Character : i found at : 6
Character : j found at : 20
Character : k found at : 8
Character : l found at : 35
Character : m found at : 22
Character : n found at : 14
Character : o found at : 12
Character : p found at : 23
Character : q found at : 4
Character : r found at : 11
Character : s found at : 24
Character : t found at : 0
Character : u found at : 5
Character : v found at : 27
Character : w found at : 13
Character : x found at : 18
Character : y found at : 38
Character : z found at : 37
 * 
*/