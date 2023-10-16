package containment;

public class Employee {

	int eno;
	String enm;
	Mydate d1;    //Contained object

	
	public Employee(){
		eno=101;
		enm="sonali";
		

	}
	public Employee(int sno,String snm,Mydate d1){
		this.eno=sno;
		this.enm=snm;
		this.d1=d1; //assign data to myDate class

	}
	
	public String toString() {
		return eno + " " + enm + " " +d1;
	}

	}


