import java.util.Scanner;
class PassFail
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total marks(out of 600) : " );
		int marks = sc.nextInt();
		if(marks<=600 && marks>=0)
		{
			int percent = (marks*100)/600;
			System.out.println("Percentage is : "+percent+"%");
			String op = (percent<35)?("FAIL"):(percent>35 && percent <=60)?("PASS, C grade"):(percent>60 && percent<=75)?("PASS, B grade"):(percent>75 && percent<=100)?("PASS, A grade"):(" Will never execute ");
			System.out.println(op);
		}
		return;
	}
}
