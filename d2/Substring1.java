package wk1.d2;

public class Substring1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name = " fly me  to the moon";
		char[] charArray = name.toCharArray();
			//Declare Substring
		CharSequence subSequence = name.subSequence(16,20);
		int length = subSequence.length();
		for (int i = 0; i < charArray.length; i++) 
		{
			System.out.println(" The last word is "+subSequence + "Length is "+length);
			break;
		}
		

	}

}
