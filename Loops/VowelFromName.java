import java.util.Scanner;
class VowelFromName
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.next().toUpperCase();
		int len = name.length();
		for (int i = 0 ; i < len ; i++ )
		{
			char updated = name.charAt(i);
			if (updated=='A'||updated =='E' || updated=='I'||updated =='O'|| updated=='U')
				System.out.print(+updated+" ");
		}
	}
}
