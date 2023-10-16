package containmentassig;

public class Simcard{
  int simid;
  String simc;
 
  
   public Simcard() {
	   simid=143;
	   simc="jio";
   }
	   public Simcard( int simid,String simc) {
		   this.simid=simid;
		   this.simc = simc;
		 
	   }
	   public String toString() {
		   return " simid:" +simid+" simc: "+simc;
	   }
}
