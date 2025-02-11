import java.util.Scanner;
class FactorPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int dup = num;
		int cnt=0;
		for (int i = 1;i<=num ;i++ )
		{
			if(num%i==0)
			{
				cnt++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		if(cnt == 2)
		{
			System.out.println(dup+" is a prime number.");
		}
		else
		{
			System.out.println(dup+" is not a prime number.");
		}
	}
}