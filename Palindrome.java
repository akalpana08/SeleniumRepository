package assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare string
		String word ="A man, a plan, a canal: Panama";
		String rev="";
		word = word.toLowerCase();
		word = word.replaceAll("[^a-z]","");
	
		char[] charArray = word.toCharArray();
		
		for (int i = charArray.length-1; i >= 0; i--) 
		
		{
			rev =rev+charArray[i];
		}
		
		if(word.equals(rev))
		
		{
		System.out.println(rev+" is a palindrome");
		
		}
		else
		{
			System.out.println(rev+ " is not a palindrome");
		}

	}
}


