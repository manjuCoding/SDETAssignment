package reflectiontest;

public class demo3 {
public static void main(String[] args) {
	Displaydata1 d1= (int n,int n1)->{System.out.println("addition="+(n+n1));};
	d1.displayno(36, 36);
	
	Displaydata1 d2=( int n,int n1)->System.out.println("substraction="+(n-n1));;
	d2.displayno(38, 36);
}
}
