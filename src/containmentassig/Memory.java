package containmentassig;

public class Memory {

	int storage;
	
	
	public Memory() {
		storage=128;
		
	}
	
	public Memory(int storage) {
		this.storage=storage;
		
	}
	public String toString() {
		return " memory storage:"+storage;
		
	}
}
