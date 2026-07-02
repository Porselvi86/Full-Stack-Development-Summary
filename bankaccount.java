package encapsulation;

public class bankaccount {
     private int accnum;
     private float balance;
     private String name;
     
     public void setter(int accnum,float balance,String name) {
    	 this.accnum=accnum;
    	 this.balance=balance;
    	 this.name=name;
     }
     public void deposit(float amount){
    	 balance=balance+amount;
     }
     public void withdraw (float amount) {
    	 if(balance>=amount) {
    		 balance =balance-amount;
    	 }
    	 else {
    		 System.out.println("Insufficient balance");
    	 }
     }
     public int getint() {
    	 return accnum;
     }
     public float getbal() {
    	 return balance;
     }
     public String getstg() {
    	 return name;
     }
    
	public static void main(String[] args) {
		bankaccount b=new bankaccount();
		b.setter(12345678,50000,"Porselvi");
		b.deposit(20000);
        b.withdraw(1000);
        System.out.println("Account number:"+b.getint());
        System.out.println("Balance:"+b.getbal());
        System.out.println("name:"+b.getstg());
	}

}
