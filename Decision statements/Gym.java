import java.util.Scanner;
class Gym
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------Gym day to day workout plan------------------");
		System.out.println("List of days ");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Staurday");
		System.out.println("7. Sunday");
		System.out.print("Choose the day (Enter value 1-7) : ");
		int day = sc.nextInt();
		switch(day)
		{
			case 1:
			{
				System.out.println("***************** Monday ***************");
				System.out.println("-------------Back workout-------------");
				System.out.println();
				System.out.println("Pull down : 15x3 ");
				System.out.println("Bent over row : 15x3 ");
				System.out.println("Deadlift : 15x3 ");
				System.out.println("Pull up : 15x3 ");
				System.out.println("Back extension : 15x3 ");
				break;
			}
			case 2:
			{
				System.out.println("***************** Tuesday ***************");
				System.out.println("-------------Biceps workout-------------");
				System.out.println();
				System.out.println("Biceps curl : 15x3 ");
				System.out.println("Hammer curl : 15x3 ");
				System.out.println("Ez-bar curl : 15x3 ");
				System.out.println("Cable curl : 15x3 ");
				System.out.println("Chip up : 15x3 ");
				break;
			}
			case 3:
			{
				System.out.println("***************** Wednesday ***************");
				System.out.println("-------------Chest workout-------------");
				System.out.println();
				System.out.println("Flat bench press : 15x3 ");
				System.out.println("Incline bench press : 15x3 ");
				System.out.println("Decline bench press : 15x3 ");
				System.out.println("Cable crossover : 15x3 ");
				System.out.println("Pushup : 15x3 ");
				break;
			}
			case 4:
			{
				System.out.println("***************** Thursday ***************");
				System.out.println("-------------Triceps workout-------------");
				System.out.println();
				System.out.println("Diamond pushup : 15x3 ");
				System.out.println("Triceps pushdown-rope : 15x3 ");
				System.out.println("Overhead triceps extension : 15x3 ");
				System.out.println("Cable rope extesion : 15x3 ");
				System.out.println("Triceps dips : 15x3 ");
				break;
			}
			case 5:
			{
				System.out.println("***************** Friday ***************");
				System.out.println("-------------Shoulder workout-------------");
				System.out.println();
				System.out.println("Dumbell front raise : 15x3 ");
				System.out.println("Lateral raise : 15x3 ");
				System.out.println("Reverse fly : 15x3 ");
				System.out.println("Overhead press : 15x3 ");
				System.out.println("Dumell shrugs : 15x3 ");
				break;
			}
			case 6:
			{
				System.out.println("***************** Saturday ***************");
				System.out.println("-------------Leg workout-------------");
				System.out.println();
				System.out.println("Squat : 15x3 ");
				System.out.println("Lunge : 15x3 ");
				System.out.println("Leg press : 15x3 ");
				System.out.println("Leg curl : 15x3 ");
				System.out.println("Leg extension : 15x3 ");
				break;
			}
			case 7:
			{
				System.out.println("***************** Sunday ***************");
				System.out.println("Let the body recover. Take rest!");
				System.out.println("!..Stay hydrated..!");
				break;
			}
			default:
			{
				System.out.println("Enter the valid day (value between 1-7) ");
			}
		}
	}
}