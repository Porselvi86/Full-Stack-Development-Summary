package encapsulation;

public class MobilePhone {
    private String model;
    private float price;
    
    public void setter(String model,float price) {
    	this.model=model;
    	this.price=price;
    }
    public String getmodel() {
    	return model;
    }
    public float getprice() {
    	return price;
    }
	public static void main(String[] args) {
		    MobilePhone mp=new MobilePhone();
		    mp.setter("Oppo",25000);
            System.out.println(mp.getmodel());
            System.out.println(mp.getprice());
	}
}
