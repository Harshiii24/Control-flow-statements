import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		System.out.println("Number entered is : "+dup);
		System.out.println();
		while(num>0)
		{ 
			int rem = num%10;
			if (rem%2!=0)
			{ 
				int fact = 1;
				System.out.print(rem+" ");
				for(int i = rem; i>=1;i--)
				{
					fact*=i;
					
				}
				sum+=fact;
			}
			num/=10;
		}
		System.out.println();
		System.out.println("Above mentioned are the odd numbers from the digit.");
		System.out.println("Sum of factorial of odd digits : "+sum);
	}
}
