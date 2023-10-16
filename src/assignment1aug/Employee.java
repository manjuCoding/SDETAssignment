package assignment1aug;

public class Employee {
		
       int eid;
       String enm;
       double sal;
		
		public void initEmployee() {
			
		 	eid=15;
		 	enm="Manju";
		 	sal=30000.98;
		}

		public void dispEmployee() {
		System.out.println("empid:"+ eid + "empname:" + enm +" salary:" +sal);
		}
		
		public void setempid(int empid)
		{
			eid=empid;
		}
		public int getempid()
		{
			return eid;
		}
	    public void setempname(String empname)
		{
			enm=empname;
		}
		public String getempname()
		{
			return enm;
		}
		public void setsalary(double salary)
		{
			sal=salary;
		}
		public double getsalary()
		{
			return sal;
		}
	
}

