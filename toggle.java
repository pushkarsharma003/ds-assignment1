import java.util.*;
class Toggle
{
	public static String chars(String S)
	{
		char str[]=S.toCharArray();
		String s2="";
	for(int i=0;i<str.length;i++)
	{
		if((int)str[i]>=97 && (int)str[i]<=123)
		{
			s2=s2+(char)((int)str[i]-32);
		}
		else if((int)str[i]>=65 && (int)str[i]<=91)
		{
			s2=s2+(char)((int)str[i]+32);
		}	
		else
		{
			return "invalid";
		}
	}
		return s2;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		System.out.print(chars(S));
	}
}