package containmentadharcard;

public class Adharcard {
   long adharno;
   String name;
   int age;
   public Adharcard() {
	   adharno=12345;
	   name="Manju";
	   age=23;
   }
   public Adharcard(long adharno,String name,int age) {
	   this.adharno=adharno;
	   this.name=name;
	   this.age=age;
   }
   public String toString() {
	   return adharno + ":" + name + ":" + age;
   }
}
