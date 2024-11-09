/*
public class ReverseString {
	public static String reverseString(String s)
	{
		String reversedStr ="";
		for(int i=s.length()-1;i>=0;i--) {
			reversedStr +=s.charAt(i);
		}
		return reversedStr;
	}
	public static void main(String[] args) {
		String inputStr ="Hello";
		String reversedStr= reverseString(inputStr);
		System.out.println(reversedStr);
	}
}


public class ReverseString{
	public static void main(String[] args) {
		String original ="Hello";
		String reversed ="";
		
		for (int i=original.length()-1;i>=0;i--) {
			reversed +=original.charAt(i);
		}
		System.out.println(reversed);
	}
}

*/

public class ReverseString {

    public static void main(String[] args) {
        // Manually creating an array for the string
        char[] original = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        char[] reversed = new char[original.length];

        // Manually finding the length of the original array
        int length = 0;
        for (char c : original) {
            length++;
        }

        // Reversing the string by placing characters in the reversed array
        for (int i = 0; i < length; i++) {
            reversed[i] = original[length - 1 - i];
        }

        // Printing the reversed array as a string
        System.out.print("Reversed String: ");
        for (char c : reversed) {
            System.out.print(c);
        }
    }
}