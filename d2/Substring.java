package wk1.d2;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare the world
		String name = "Hello World";
		//Stored in to character array
		char[] charArray = name.toCharArray();
		//Sub string declared
		String substring = name.substring(6,11);
		// using split function word was splited by using space
		//String[] split = name.split(" ");
		//Splited word space get it into length
		int length =substring.length();
		for (int i = 0; i < charArray.length; i++) 
		{
			System.out.print("The last word is: "+substring + " with length " +length);
			//System.out.println("The Length of word: "+length);
			break;
		}
	}

}
