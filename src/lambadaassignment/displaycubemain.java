package lambadaassignment;

public class displaycubemain {

	public static void main(String[] args) {
//		Displaycube d1=(int n)->{System.out.println("cube="+(n*n*n));};
		Displaycube d1=(int n)->{return n*n*n;};
		System.out.println("cube="+d1.dispcube(10));

	}

}
