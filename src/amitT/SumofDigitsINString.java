package amitT;

public class SumofDigitsINString {

	public static void main(String[] args) {
		String str = "g34bz34jd23jsbf9bsc2";
		String arr[] = str.split("[A-Za-z]");
		
//		for (String s : arr) {
//			System.out.println(s);
//		}
     int sum = 0;
     
     for (int i = 0; i < arr.length; i++) {
		if( arr[i].matches("[0-9]+")) {
			sum += Integer.parseInt(arr[i]);
		}
		
		
	}
     System.out.println(sum);
	}

}
