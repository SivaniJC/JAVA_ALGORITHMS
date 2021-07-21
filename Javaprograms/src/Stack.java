import java.util.Scanner;
public class Stack {
	
	final int max=100;
	int s[]=new int[max];
	int top = -1;
	
	void push(int num)
	{
		if(top==max-1)
			System.out.println("Stack overflow");
		else
			s[++top]=num;
	}
	void pop() 
	{
		if(top==-1)
			System.out.println("Stack Underflow");
		else
			System.out.println("Deleted "+s[top--]);
	}
	void display() 
	{
		if(top==-1)
			System.out.println("Stack is Empty");
		else
		{
			for(int i=top;i>=0;i--)
				System.out.println(s[i]);
		}
	}
	public static void main(String[] args) {
		
		int q=1,num,ch;
		Stack m=new Stack();
		System.out.println("STACK OPERATION\nSIZE OF STACK=100");
		Scanner sc=new Scanner(System.in);
		while(q!=0)
		{
			System.out.println("\n1.Push\t2.Pop\t3.Display\t4.Exit");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1: System.out.println("\nEnter the element to be pushed");
					num=sc.nextInt();
					m.push(num);
					break;
			case 2: m.pop();
					break;
			case 3: System.out.println("Stack Elements");
					m.display();
					break;
			case 4: q=0;
			}
		}
		sc.close();
	}
}
