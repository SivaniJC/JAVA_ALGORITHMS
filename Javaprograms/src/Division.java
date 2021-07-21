import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a,b,quotient;
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 2 numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			quotient=a/b;
			System.out.println("Quotient="+quotient);
			sc.close();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Division by zero error");
		}
	}
}
