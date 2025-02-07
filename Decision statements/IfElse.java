//This program tells whether the character is uppercase or lowercase vowel or consenent as well as whether the entered number is digit or special character. 

import java.util.Scanner;
class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = sc.next().charAt(0);
		if (ch>=65 && ch<=90 || ch>=97 && ch<=122)
		{
			String uppercase = (ch>=65 &&ch<=90)?("uppercase"):("lowercase");
			String op = (ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')?(ch+" is "+uppercase+" vowel"):(ch+" is "+uppercase+" consenent");
			System.out.println(op);
		}
		else
			System.out.println((ch>=48 && ch<=57)?(ch+" is a digit"):(ch+" is a special character"));
		}
}
