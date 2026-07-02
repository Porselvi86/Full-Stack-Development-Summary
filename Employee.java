package encapsulation;

public class Employee {
          private String name;
          private int age;
          private float salary;
          
          public void setter(String name,int age,float salary) {
        	  this.name=name;
        	  this.age=age;
        	  this.salary=salary;
          }
          public String getname() {
        	  return name;
          }
          public int getage(){
        	  return age;
          }
          public float getsalary(){
        	  
        	  return salary;
          }
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setter("Porselvi",19,30000);
		System.out.println(e.getname());
		System.out.println(e.getage());
		System.out.println(e.getsalary());
		

	}

}
