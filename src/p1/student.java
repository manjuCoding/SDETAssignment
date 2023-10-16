package p1;

public class student<studentrollNo> {
    int rollNo;
    String Name;
    float percentage;
	void intStudents(int studentrollNo,float percentage, String name){
		this.rollNo=studentrollNo;
		this.percentage=percentage ;
		this.Name=name ;
	}
	void printDetails(){
		System.out.println(this.Name);
		System.out.println(this.rollNo);
		System.out.println(this.percentage);
	}

}
