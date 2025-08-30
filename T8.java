import java.util.TreeSet;

public class T8 {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Black");
		ts.add("Green");
		ts.add("Red");
		ts.add("White");
		
		System.out.println("Free Tree set: "+ts);
		
      TreeSet<String> ts1=new TreeSet<String>();
		
		ts1.add("Black");
		ts1.add("Orange");
		ts1.add("Pink");
		ts1.add("Red");
		
		System.out.println();
		System.out.println("Second Tree set: "+ts1);
		
		System.out.println();
		System.out.println("Output: ");
		for(String a:ts)
		{
			if(ts1.contains(a))
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
		
			

	}

}

//Test input:
//[Black, Green, Red, White]
//
//[Black, Orange, Pink, Red] 
//
//
//Sample Output:Free Tree set: [Black, Green, Red, White]
//Second Tree set: [Black, Orange, Pink, Red] 
//Yes
//No
//Yes
//No