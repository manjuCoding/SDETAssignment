package assignment4aug;

public class ElectronicDevice {
 String brand;
 int price;
 public ElectronicDevice() {
	 brand = "Sumsung";
	 price = 30000;
	 
 }
 public ElectronicDevice(String brand,int price) {
	  
	 this.brand=brand;
	 this.price= price;
 }
 public String toString() {
	 return brand+" "+price;
 }
public void print() {
	System.out.println("Brand: "+brand+"Price: "+price);
	
}
}
