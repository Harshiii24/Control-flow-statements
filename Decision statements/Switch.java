import java.util.Scanner;
class  Switch
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("-----------------------Time Table-----------------------");
		System.out.println("!!Days of week!!");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");
		System.out.print("Choose the day [Enter number (1-7) ] : ");
		int day = sc.nextInt();
		switch(day)
		{
			case 1:
			{
				System.out.println("Practice Math");
				break;
			}
			case 2:
			{
				System.out.println("Explore History");
				break;
			}
			case 3:
			{
				System.out.println("Experiance Science");
				break;
			}
			case 4:
			{
				System.out.println("Speak English");
				break;
			}
			case 5:
			{
				System.out.println("Learn the vyakran of Marathi");
				break;
			}
			case 6:
			{
				System.out.println("Do Art and Craft work");
				break;
			}
			case 7:
			{
				System.out.println("Enjoy your holiday..!!");
				break;
			}
			default:
			{
				System.out.println("Enter valid day from (1-7)");
			}
		}
	}
}
