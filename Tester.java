class Person{
	public String name;
	public int yob;
	public Person(String n, int y){
		name = n;
		yob = y;
	}
	 public String toString(){
		return ("Persons name: " + name + "\n  yob:" + yob);
	 }
}
//no constructors allowed
class Scholar extends Person{
	public String major;
	
	 public Scholar(String name, int birth, String major){
		 super(name, birth);
		 this.major = major;
	 }
	 
	 public String toString(){
		return ("Scholars name: " + super.name + "\n  major:" + major + "\n  yob:" + super.yob); 
	 }
}

class Instructor extends Person{
	public int salary;
	
	public Instructor(String name, int birth, int salary){
		 super(name, birth);
		 this.salary = salary;
	 }
	 
	 public String toString(){
		return ("Instructor name: " + super.name + "\n  salary: $" + salary+ "\n  yob:" + super.yob);
	 }
}

public class Tester{
	public static void main(String args[]){
		Person p1 = new Person("Bob", 1939);
		Person p2 = new Person("Joe", 1972);
		
		Scholar s1 = new Scholar("Ryan", 1999,"Math");
		Scholar s2 = new Scholar("Kai", 1991,"English");
		
		Instructor i1 = new Instructor("Jeff", 2999, 12300);
		Instructor i2 = new Instructor("Greg", 1789, 32100);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(i1);
		System.out.println(i2);
	}
}
