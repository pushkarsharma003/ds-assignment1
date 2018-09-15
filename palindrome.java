import java.util.*;
class Palindrome
{
	public static boolean compare(String S)
	{
		StringBuilder b=new StringBuilder(S);
		StringBuilder c=b.reverse();
		System.out.println("entered string is : "+S);
		if(S.contains(c))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("entered the string:");
		String S=sc.next();
		System.out.print(compare(S));
	}
}