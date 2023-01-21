package assignment;


public class Substring {
	
	public static void main(String[] args) {
		
		// Declare the word
		String name = "Hello World";
		char[] charArray = name.toCharArray();
		CharSequence subSequence = name.subSequence(6,11);
		int length = subSequence.length();
		for (int i = 0; i < charArray.length; i++) 
		{
			System.out.println("The Last word is "+subSequence+" with length "+length);
			break; 
			
		}
	}

}
