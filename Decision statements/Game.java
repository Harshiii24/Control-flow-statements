import java.util.Scanner;
class Game
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int codeOpt = 0;
		for(; ; )
		{
			int num = (int)(Math.random()*10);
			if(num>=1 && num<=3)
			{
				codeOpt = num;
				break;
			}
		}
	System.out.print("Enter your input in number (1:STONE, 2:PAPER, 3:SCISSOR) = ");
	int userOpt = sc.nextInt();
	System.out.println("Your entered input is : ");
	if(userOpt == 1)
		System.out.println("1. STONE");
	else if(userOpt == 2)
		System.out.println("2. PAPER");
	else if(userOpt == 3)
		System.out.println("3. SCISSOR");
	else
		System.out.println("Oops you entered an invalid input!");
	System.out.println("Bot input is : ");
	if(codeOpt == 1)
		System.out.println("1. STONE");
	else if(codeOpt == 2)
		System.out.println("2. PAPER");
	else if(codeOpt == 3)
		System.out.println("3. SCISSOR");
	System.out.println("**********WINNER***************");
	if((userOpt == 1 && codeOpt == 3) || (userOpt == 2 && codeOpt == 1)|| (userOpt == 3 && codeOpt == 2))
		System.out.println("USER");
	else if((userOpt == 1 && codeOpt == 2) || (userOpt == 2 && codeOpt == 3)|| (userOpt == 3 && codeOpt == 1))
		System.out.println("BOT");
	else
		System.out.println("Match is draw.");
	}
}
