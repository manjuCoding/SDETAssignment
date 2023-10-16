package assig4aug;

public class Testinheritance {
 public static void main(String[]args) {
	    
	 cricketer c1= new cricketer( "Amit",25,"Cricket");
	 c1.show();
	 
	 Batsman b1=new Batsman("sachin",45,"cricketplayer",25,45);
	 b1.show();
	 
	 Hockyplayer h1=new Hockyplayer("Shandhu",32,"Hockyplayer");
	 h1.show();
	 
	 Football f1=new Football("Messi",45,"Footballplayer");
	 f1.show();
	 
	 
	 Bowler a1=new Bowler ("xyz",45,"bowler",25,2);
	 a1.show();
 }
}
