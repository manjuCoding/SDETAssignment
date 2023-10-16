package assignment4aug;

public class computer extends ElectronicDevice {
   String model;
   public computer(String brand,int price,String model) {
	   super(brand,price);
	   this.model=model;
   }
	public String toString() {
		return super.toString()+" "+model;
   }
	public void print() {
		System.out.println(" Brand: "+brand  +" Price: "+price  +" model: "+model);
	}
}