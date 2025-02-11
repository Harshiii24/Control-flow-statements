import java.util.Scanner;
class Factorial1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		while(num>0)
		{
			int rem = num%10;
			int fact = 1;
			for(int i = rem; i>=1;i--)
			{
				fact*=i;
				System.out.println(fact+ " ");
			}
			num/=10;
		}
	}
}
