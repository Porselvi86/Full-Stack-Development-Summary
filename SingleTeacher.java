package typesofinheritance;
   class Teacher{
	void Subject()
	{
		System.out.println( "Maths Subject");
	}
}
   class Mathteacher extends Teacher{
	   void MathsSubject()
	   {
		   System.out.println("Maths Mam");
	   }
   }
public class SingleTeacher {

	public static void main(String[] args) {
	        Mathteacher m = new Mathteacher();
	        m.Subject();
	        m.MathsSubject();
	        

	}

}
