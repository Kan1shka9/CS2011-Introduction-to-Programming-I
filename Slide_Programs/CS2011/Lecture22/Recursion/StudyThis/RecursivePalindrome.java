package CS2011.Lecture22.Recursion.StudyThis;

public class RecursivePalindrome {

	public static void main(String[] args) {
		
		System.out.println("Is moon a palindrome " + isPalindrome("moon"));
		System.out.println("Is noon a palindrome " + isPalindrome("noon"));
		System.out.println("Is a a palindrome " + isPalindrome("a"));
		System.out.println("Is ab a palindrome " + isPalindrome("ab"));
		System.out.println("Is aba a palindrome " + isPalindrome("aba"));

	}
	
	public static boolean isPalindrome(String s) {
		if (s.length() <= 1) {
			return true;
		}
		else if (s.charAt(0) != s.charAt(s.length() - 1)) {
			return false;
		}
		else {
			return isPalindrome(s.substring(1, s.length() - 1));
		}
	}

}