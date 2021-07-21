import java.util.Scanner;
public class Student {
	String usn,name,branch,phone;
	Student(String a,String b,String c,String d)
	{
		usn=a;
		name=b;
		branch=c;
		phone=d;
	}
	public static void main(String[] args) {
		
		int i,n;
		Student s[]=new Student[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Students:");
		n=sc.nextInt();
		System.out.println("Enter the details");
		for(i=0;i<n;i++)
		{
			System.out.println("Student No: "+(i+1));
			System.out.println("Enter USN,Name,Branch,Phone:");
			String a=sc.next();
			String b=sc.next();
			String c=sc.next();
			String d=sc.next();
			s[i]=new Student(a,b,c,d);
		}
		System.out.println("Student details:");
		System.out.println("USN\tName\tBranch\tPhone");
		for(i=0;i<n;i++)
		{
			System.out.println(s[i].usn+"\t"+s[i].name+"\t"+s[i].branch+"\t"+s[i].phone);
			
		}
		sc.close();
	}
	
}
