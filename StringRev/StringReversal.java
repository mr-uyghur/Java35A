import java.util.*;

public class StringReversal
{
	public static void main(String[] args)
	{
		System.out.print("Enter a string here: ");
		Scanner input = new Scanner(System.in);

		String text = input.nextLine();

		System.out.println("Reverse with recursion");
		System.out.print(reverseRecursively(text));
		System.out.println();

		System.out.println("Reverse with loop");
		reverseWithLoop(text);
		System.out.println();

	}

	public static String reverseRecursively(String str)
	{
		int len = str.length();
		if(len == 1)
			return str;
		System.out.print(str.charAt(len-1));
		return reverseRecursively(str.substring(0, len-1));

	}

	public static void reverseWithLoop(String str)
	{
		int len = str.length();
		for(int i = len - 1; i >= 0; i--)
			System.out.print(str.charAt(i));

	}

}