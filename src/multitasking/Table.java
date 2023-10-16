package multitasking;
 class Table {
	public void printTable(int no) {
		for(int i=1;i<10;i++)
			System.out.println(no*i);
	}
	class Reshma extends Thread{
		Table t1;
		public Reshma (Table t1) {
			this.t1=t1;
		}
		public void run() {
			t1.printTable(5);
		}
		
	}
	class Sarang extends Thread{
		Table t1;
		public Sarang(Table t1) {
			this.t1=t1;
		}
		public void run() {
			t1.printTable(6);
	    }	
	}
	class Demo {

	    public static void main(String[] args){
	      Table t1=new Table();
	     
	      Reshma r1=new Reshma(t1);//initialization of Table class plus coantianed object
	      Sarang s1=new Sarang(t1);
	     
	       s1.start();
	      r1.start();
	}
}
}
 