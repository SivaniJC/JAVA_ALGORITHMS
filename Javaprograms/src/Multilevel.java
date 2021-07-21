
class Staff
{
	int staffid,phone,salary;
	String name;
	public Staff(int id,String n,int ph,int sal)
	{
		staffid=id;
		name=n;
		phone=ph;
		salary=sal;
	}
	void display()
	{
		System.out.println("");
		System.out.println("Staff ID:"+ " "+ staffid);
		System.out.println("Staff Name:" +" "+ name);
		System.out.println("Staff Phone number:" + " "+ phone);
		System.out.println("Staff Salary:" +" "+salary);
	}
}

class Teaching extends Staff
{
	String domain;
	int no_of_publications;
	public Teaching(int id,String n,int ph,int sal,String d,int nop)
	{
		super(id,n,ph,sal);
		domain=d;
		no_of_publications=nop;
	}
	void displayT()
	{
		System.out.println(" ");
		System.out.println("Teaching Staff Details");
		super.display();
		System.out.println("Domain :" + " "+domain);
		System.out.println("No_of_publications:"+" "+no_of_publications);
	}
}

class Technical extends Staff
{
	String skills;
	int no_of_publications;
	public Technical(int id,String n,int ph,int sal,String sk)
	{
		super(id,n,ph,sal);
		skills=sk;
	}
	void displayTe()
	{
		System.out.println(" ");
		System.out.println("Technical Staff Details");
		super.display();
		System.out.println("Skills :" + " "+skills);
	}
}

class Contract extends Staff
{
	int period;
	public Contract(int id,String n,int ph,int sal,int pd)
	{
		super(id,n,ph,sal);
		period=pd;
	}
	void displayC()
	{
		System.out.println(" ");
		System.out.println("Contract Staff Details");
		super.display();
		System.out.println("Contract Period :" + " "+period+" year");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		
		Teaching t1=new Teaching(11,"Anil",988614,30000,"CSE",10);
		Teaching t2=new Teaching(12,"Anu",9886514,35000,"ECE",8);
		Teaching t3=new Teaching(11,"Anil",988614,30000,"CSE",10);
		t1.displayT();
		t2.displayT();
		t3.displayT();
		
		Technical te1=new Technical(21,"Kumar",982454,22000,"C");
		Technical te2=new Technical(22,"Kriku",993454,22000,"Java");
		Technical te3=new Technical(23,"Kiran",9454,22000,"Python");
		te1.displayTe();
		te2.displayTe();
		te3.displayTe();
		
		Contract ct1=new Contract(31,"Anil",9985434,35000,3);
		Contract ct2=new Contract(32,"Meghana",9145678,39000,2);
		Contract ct3=new Contract(33,"Uma",9922345,30000,4);
		ct1.displayC();
		ct2.displayC(); 
		ct3.displayC();
	}

}
