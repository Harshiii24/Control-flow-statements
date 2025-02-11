import java.util.Scanner;
class TempConv 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float tempf = 0;
		float tempk = 0;
		float tempre = 0;
		float tempra = 0;
		for(int i = 1; i<=4; i++)
		{
			System.out.println();
			System.out.print("Enter the temperature in degree celsius : ");
			float tempc = sc.nextFloat();
			System.out.println();
			System.out.println("1. Fahrenheit");
			System.out.println("2. Kelvin");
			System.out.println("3. Réaumur");
			System.out.println("4. Rankine");
			System.out.println();
			System.out.print("Choose the option (1-4) : ");
			int opt = sc.nextInt();
			if(opt == 1)
			{
				tempf = ((9.0f/5.0f)*tempc)+32.0f;
				System.out.println();
				System.out.println(tempc+" celsius is equal to "+tempf+" Fahrenheit.");
			}
			else if(opt == 2)
			{
				tempk = (tempc+273.15f);
				System.out.println();
				System.out.println(tempc+" celsius is equal to "+tempk+" Kelvin.");
			}
			else if(opt == 3)
			{
				tempre = tempc*0.8f;
				System.out.println();
				System.out.println(tempc+" celsius is equal to "+tempre+" Réaumur.");
			}
			else if(opt == 4)
			{
				tempra = (tempc*(9.0f/5.0f))+491.67f;
				System.out.println();
				System.out.println(tempc+" celsius is equal to "+tempra+" Rankine.");
			}
			else
			{
				i--;
				System.out.println();
				System.out.println("Error : Enter the valid option ");
				System.out.println("Enter the number from 1 to 4 ");
			}
		}
	}
}
