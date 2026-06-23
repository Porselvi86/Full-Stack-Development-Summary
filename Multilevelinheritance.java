package typesofinheritance;
class Person{
	void name() {
		System.out.println("Porselvi");
	}
}
class Employee extends Person{
	void Salary()
	{
		System.out.println(1000);
		}
	}
class Manager extends Employee{
	void Instruction() {
		System.out.println("Stay silent");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.name();
		m.Salary();
		m.Instruction();

	}

}
