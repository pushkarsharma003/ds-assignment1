import java.util.*;
class Substr
{
	public static void Bird(String S)
	{
		for(int i=0;i<S.length();i++)
		{
			for(int j=i+1;j<=S.length();j++)
			{
				System.out.print(S.substring(i,j));
				System.out.println();
			}
		}
	}	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		Bird(S);
	}
}