//Test of Inheritance
//import ArrayList
import java.util.ArrayList;
//PERSON CLASS that is a parent of Scholar and Instructor
class Person{
	public String name;
	public int yob;
	//constructor that sets Person variables
	public Person(String n, int y){
		name = n;
		yob = y;
	}
	//converts data to formatted string 
	public String toString(){
		return ("PERSONS NAME: " + name + "\n  - Year of birth: " + yob);
	}
}
//SCHOLAR CLASS that is a child of Person
class Scholar extends Person{
	public String major;
	//constructor that uses Person variables and major
	public Scholar(String name, int birth, String major){
		super(name, birth);
		this.major = major;
	}
	 //converts data to formatted string 
	public String toString(){
		return ("SCHOLARS NAME: " + super.name + "\n  - Year of birth: " + super.yob + "\n  - Major: " + major); 
	}
}

//INSTRUCTOR CLASS that is a child of Person
class Instructor extends Person{
	public int salary;
	//constructor that uses Person variables and salary
	public Instructor(String name, int birth, int salary){
		 super(name, birth);
		 this.salary = salary;
	}
	//toString method to format data
	public String toString(){
		return ("INSTRUCTORS NAME: " + super.name  + "\n - Year of birth: " + super.yob + "\n - Salary: $" + salary);
	}
}
//TESTER CLASS: This calls instances of the other classes and puts those objects into an ArrayList and prints them out
public class Tester{
	//main function
	public static void main(String args[]){
		Person p1 = new Person("Bob", 1939);
		Person p2 = new Person("Joe", 1972);
		
		Scholar s1 = new Scholar("Ryan", 2005, "Math");
		Scholar s2 = new Scholar("Kai", 1991, "English");
		
		Instructor i1 = new Instructor("Jeff", 1955, 90300);
		Instructor i2 = new Instructor("Greg", 2000, 52100);
		
		ArrayList<Person> arr = new ArrayList<Person>();
		
		arr.add(p1); arr.add(p2); arr.add(s1); arr.add(s2); arr.add(i1); arr.add(i2); 
		
		for(int i = 0; i<arr.size(); i++){
			System.out.println(arr.get(i));
		}
	}
}

