import java.util.TreeSet;

public class T5 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Black");
		ts.add("Green");
		ts.add("Orange");
		ts.add("Red");
		ts.add("White");
		
		System.out.println("Tree set: "+ts);
		
		System.out.println("First Element is: "+ts.first());
		System.out.println("Last Element is: "+ts.last());
		
		
	
		

	}

}
//Test input:
//Black, Green, Orange, Red, White
//
//
//Sample Output:Tree set:
//[Black, Green, Orange, Red, White]
//First Element is: Black
//Last Element is: White