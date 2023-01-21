package assignment;

public class EmptyStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= " ";
		String rev = "";
		s = s.replaceAll("[a-z]", "");
		char[] charArray = s.toCharArray();
		for (int i = charArray.length-1; i >= 0; i--) 
		
		{
			rev = rev+s;
		}
		
		if (s.equals(rev))
		{
			System.out.println(rev+" is palindrome");
	}
		else 
		{
			System.out.println(rev+" is not a palindrome");
		}
}
}