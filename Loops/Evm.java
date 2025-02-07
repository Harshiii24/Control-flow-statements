import java.util.Scanner;
class Evm 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int bjp = 0, con = 0, ss = 0, aap = 0, mns = 0, not = 0;
		System.out.println("Enter the population: ");
		int pop = sc.nextInt();
		for(int i=1; i<=pop; i++)
		{
			System.out.println();
			System.out.println("     Welcome     ");
			System.out.println();
			System.out.println("****** List of parties ******");
			System.out.println("1.BJP");
			System.out.println("2.Congress");
			System.out.println("3.Shiv Sena");
			System.out.println("4.AAP");
			System.out.println("5.MNS");
			System.out.println("6.NOTA");
			System.out.println("Enter your vote : ");
			int vote = sc.nextInt();
			if(vote==1)
			{
				bjp++;
				System.out.println("You voted for BJP.");
			}
			if(vote==2)
			{
				con++;
				System.out.println("You voted for Congress.");
			}
			if(vote==3)
			{
				ss++;
				System.out.println("You voted for Shiv Sena.");
			}
			if(vote==4)
			{
				aap++;
				System.out.println("You voted for Aam Aadmi Party.");
			}
			if(vote==5)
			{
				mns++;
				System.out.println("You voted for Maharashtra Navnirman Sena.");
			}
			if(vote==6)
			{
				not++;
				System.out.println("You voted for None Of The Above.");
			}

			if(!(vote>=1 && vote<=6))
			{
				i--;
				System.out.println("Invalid input");
				
			}
		}
			if (bjp>=con && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=not)
			{
				System.out.println("BJP won the election by "+bjp+" votes.");
				return;
			}
			if (con>=bjp && con>=ss && con>=aap && con>=mns && con>=not)
			{
				System.out.println("Congress won the election by "+con+" votes.");
				return;
			}
			if (ss>=con && ss>=bjp && ss>=aap && ss>=mns && ss>=not)
			{
				System.out.println("Shiv Sena won the election by "+ss+" votes.");
				return;

			}
			if (aap>=con && aap>=ss && aap>=bjp && aap>=mns && aap>=not)
			{
				System.out.println("AAP won the election by "+aap+" votes.");
				return;
			}
			if (mns>=con && mns>=ss && mns>=aap && mns>=bjp && mns>=not)
			{
				System.out.println("MNS won the election by "+mns+" votes.");
				return;
			}
			if (not>=con && not>=ss && not>=aap && not>=mns && not>=bjp)
			{
				System.out.println("NOTA won the election by "+not+" votes.");
				return;
			}
		}
}

