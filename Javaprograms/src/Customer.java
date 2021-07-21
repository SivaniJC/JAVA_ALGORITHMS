import java.util.Scanner;
import java.util.StringTokenizer;

public class Customer {
	
	String name;
	String date;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name");
		name=sc.next();
		System.out.println("Enter the Date of Birth(dd/mm/yyyy)");
		date=sc.next();
		sc.close();
	}
	
	public void display()
	{
		System.out.println("The Customer details are");
		String value=name;
		StringTokenizer st=new StringTokenizer(date,"/");
		while(st.hasMoreTokens())
			value=value+","+st.nextToken();
		System.out.println(value);
	}

	public static void main(String[] args) {
		Customer c=new Customer();
		c.read();
		c.display();
	}

}
