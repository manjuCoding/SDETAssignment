package p6;
import java.util.function.Predicate;
public class Predicttest {

	public static void main(String[] args) {
	
		Predicate<String> chkLength = (String str)->str.length()>5;
		
		System.out.println("result="+chkLength.test("sonali"));

	}

}
