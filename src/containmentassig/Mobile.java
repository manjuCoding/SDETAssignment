package containmentassig;

public class Mobile {
	
    String brand;
    int mid;
    String color;
    int price;
    simcard s1;
    public Mobile() {
    	
    	brand ="Redmi";
    	mid=101;
    	color="Blue";
    	
    }
    public  Mobile(String brand,int mid,String color) {
    	this.brand=brand;
    	this.mid=mid;
    	this.color=color;
    }
    public String toString() {
		return " brand:" +brand+" mid:" +mid+" color:"+ color;
    }
}
