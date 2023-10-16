package p2;

public class Testcouner {
	
	static int cnt=1;
	public Testcouner() {
		System.out.println("cnt="+cnt);
		cnt++;
	}

	public static void main(String[] args) {
		 Testcouner t1 = new Testcouner ();
		 Testcouner t2 = new Testcouner ();
		 Testcouner t3 = new Testcouner ();
	}

}
