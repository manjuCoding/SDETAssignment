package p6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
	
	    public static void main(String[] args) {
	       
	        //1.Build stream from collection
	       
	         List<Integer>l1=new ArrayList<Integer>();
	          l1.add(15);
	          l1.add(25);
	          l1.add(65);
	          l1.add(45);
	          l1.add(28);
	         
	          //2.Transform stream
	          Stream<Integer> str=l1.stream();
	         
	         
	         
	            //1.Build stream from Array
	          Integer []num= {15,45,18,98,56};
	         
	          //2.Transform Array into stream
	          Stream<Integer> str2=Stream.of(num);
	         
	         //asList()->This method acts  as bridge between array-based and collection-based APIs,
	          List<Integer> l2=new ArrayList(Arrays.asList(15,12,25,8,5));
	         
	         
	          //3.collect resuslt
	          List<Integer>res=l2.stream() //store array into stream
	                             .map(value->value*2) //mapping data and compute (multiplied each value by 2)
	                             .collect(Collectors.toList()); //convert stream data into List
	         
	          System.out.println(res);
	         
	         
	          List<Integer>res1=l2.stream() //store array into stream
	                     .filter(value->value%2==0) //filter data which is mod by 2
	                     .collect(Collectors.toList()); //convert stream data into List

	       System.out.println(res1);
	      // List<Integer> list=new ArrayList(Arrays.asList(15,12,25,8,5));
	       System.out.println("Asending Order");
	       l2.stream().sorted()
	       .forEach( System.out::println);
	       
	       System.out.println("\nDescending Order");
	       l2.stream().sorted(Comparator.reverseOrder())
	       .forEach( System.out::println);
	    }

	}

