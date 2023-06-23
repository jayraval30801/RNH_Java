package VijapurJava;

class Address
{
	String flatNo;
	String flatName;
	String Area;
	String country;
	Address(String fn,String fname,String a,String c)
	{
		flatNo = fn;
		flatName = fname;
		Area = a;
		country = c;
	}
	
}
class Employee
{
	String name;
	String specialization;
	int salary;
	Address adr;
	Employee(String n,String s,int sal,Address ad)
	{
			name = n;
			specialization = s;
			salary  = sal;
			adr = ad;
	}
	
	void display()
	{
		System.out.println(""+name);
		System.out.println(""+specialization);
		System.out.println(""+salary);
		System.out.println(""+adr.flatNo);
		System.out.println(""+adr.flatName);
		System.out.println(""+adr.Area);
		System.out.println(""+adr.country);
	}
	
}

public class AggregationInJava {

		public static void main(String[] args) {
				Address adr = new Address("D-701","Namrata Society","Vijapur","India");
				Employee emp = new Employee("Raj","Java Developer",120000,adr);
				emp.display();
		}
}
/*
 * Inheritence : 
 * is a Relation : Company => Employee  Car -> Vehicle 
 * Has a Relation : Company => Employee --> Address (city , state, country) 
 * 
 * 
 * */
