import java.util.Scanner;
class Practice 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter c for celsius and f for fahrenheit : ");
		char con = sc.next().charAt(0);
		String state=((con=='f'||con=='F')?("Enter the temerature in fahrenheit: "):(con=='c'||con=='C')?("Enter the temerature in celsius: "):("Error: Invalid input"));
		System.out.println(state);
		if(state.equals("Error: Invalid input"))
		{
			return;
		}
		float temp = sc.nextFloat();
		if(con=='F'||con=='f')
		{
			float cel = (temp-32)*5/9;
			System.out.println(temp+" fahrenheit -> "+cel+" celsius");
			return;
		}
		if(con=='c'||con=='C')
		{
			float fah= (temp*9/5) + 32;
			System.out.println(temp+" celsius -> "+fah+" fahrenheit");
			return;
		}
	}
}
