package override;

import java.util.ArrayList;

public class Supresswarning {
	@SuppressWarnings({"rawtypes","unchecked"})
public static void main(String[] args) {
	
	ArrayList l1 =new ArrayList();
	l1.add(1);
	l1.add(1.6);
	l1.add("Manju");
	l1.add(15.66);
	
	  System.out.println(l1);
}
}
