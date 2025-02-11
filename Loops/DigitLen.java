import java.util.Scanner;
class DigitLen 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int cnt = 0;
		int rev = 0;
		int place = 1;
		int eres = 0;
		int ores = 0;
		for (int i = num;i>0 ;i/=10 )
		{
			int rem = i%10;
			rev = rev*10 +rem;
			cnt++;
		}
		System.out.println("Number of digits in number = "+cnt);
		if(cnt%2==0)
		{
			System.out.println("Even number of digits.");
			while(dup>0 )
			{ 
				int rem1 = dup%10;

				if(rem1%2!=0)
				{
					rem1++;

				}
				eres = eres+ (rem1*place);
				place *=10; 
				dup/=10;
			}
			System.out.println(eres);
		}
		else
		{
			System.out.println("Odd number of digits.");
			while(dup>0 )
			{ 
				int rem1 = dup%10;

				if(rem1%2==0)
				{
					rem1++;

				}
				ores = ores+ (rem1*place);
				place *=10; 
				dup/=10;
			}
			System.out.println(ores);
		}
	}
}
