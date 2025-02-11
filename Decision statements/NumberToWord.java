import java.util.Scanner;
class NumberToWord 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		String word = "";
		int rev = 0;
		for(int i = num ; i>0 ;  i/=10)
		{
			int rem = i%10;
			rev = rev*10+rem;
		}
		for(int j = rev;j>0;j/=10)
		{
			int rem1 = j%10;
			switch (rem1)
			{
				case 1:
				{
					word+=" one ";
					break;
				}
				case 2:
				{
					word+=" two ";
					break;	
				}
				case 3:
				{
					word+=" three ";
					break;	
				}
				case 4:
				{
					word+=" four ";
					break;
				}
				case 5:
				{
					word+=" five ";
					break;
				}
				case 6:
				{
					word+=" six ";
					break;
				}
				case 7:
				{
					word+=" seven ";
					break;
				}
				case 8:
				{
					word+=" eighT ";
					break;
				}
				case 9:
				{
					word+=" nine ";
					break;
				}
				case 0:
				{
					word += " zero ";
					break;
				}
			}
		}	
		System.out.println("In number : "+dup);
		System.out.println("In Words :"+word);
	}
}
