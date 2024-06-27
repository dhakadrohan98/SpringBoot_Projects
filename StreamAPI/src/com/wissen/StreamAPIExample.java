package com.wissen;

class Emp1 {
	
	String name;
	int age;
	int salary;
	String designation;
	
	public Emp1(String name, int age, int salary, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
}

public class StreamAPIExample {

	public static void main(String[] args) {
		Emp emp11 =new Emp("Talku", 21, 45000, "Developer");
		Emp emp1 =new Emp("Ritesh", 19, 47000, "Developer");
		Emp emp2 =new Emp("Suresh", 22, 40000, "Tester");
		Emp emp3 =new Emp("Attu", 20, 46000, "Developer");
		Emp emp4 =new Emp("Shubham", 25, 55000, "Manager");
		Emp emp5 =new Emp("Shivam", 24, 49000, "Developer");
		Emp emp6 =new Emp("Talku", 28, 60000, "Manager");
		Emp emp7 =new Emp("Talku", 26, 35000, "Tester");
		Emp emp8 =new Emp("Talku", 30, 48000, "Developer");

	}

}
