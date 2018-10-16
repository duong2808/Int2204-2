package lab03;

public class Teacher {
	private String name;
	private int age;
	private double salary;
	
	// Constructor
	public Teacher() {};
	public Teacher(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	// Getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// Show Info
	public String showInfo() {
		return ("Name: " + this.name + "\nAge: " + this.age + "\nSalary: " + this.salary);
	}
}
