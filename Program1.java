import java.util.*;
class Program1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input string in locNMnameSALsalary format");
		String locationNameSalary = sc.next();
		if(locationNameSalary.matches("[A-Z][a-z]+NM[A-Z]?[a-z]*\\-?[A-Z]*[a-z]+SAL[0-9]{2,}")){
			
			
			System.out.println(findGrade(buildPerson(locationNameSalary)));
		}
		else System.out.println("Enter the input in locNMnameSALsalary format");
	}

	public static Person buildPerson(String locationNameSalaryString){
		String arr[]=locationNameSalaryString.split("NM|SAL");
		String location = arr[0];
		String name = arr[1];
		double salary = Double.parseDouble(arr[2]);
		Person p1 = new Person(location, name, salary);
		return p1;
	}

	public static String findGrade(Person person){
		String grade=null;
		if(person.getSalary()<10000) grade = "C";
		else if(person.getSalary()>=10000 && person.getSalary()<25000) grade = "B";
		else if(person.getSalary()>25000) grade = "A";
		return grade;
	}
}

class Person{
	private String loc;
	private String name;
	private double salary;

	public Person(String loc, String name, double salary){
		super();
		this.loc = loc;
		this.name = name;
		this.salary = salary;
	}

	public String getLoc(){
		return loc;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public void setLoc(String loc){
		this.loc = loc;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}

	@Override
	public String toString(){
		return "Person [loc="+loc+", name="+name+", salary="+salary+"]";
	}
}