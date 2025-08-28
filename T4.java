import java.util.TreeSet;

public class T4 {

	public static void main(String[] args) {
      TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Black");
		ts.add("Green");
		ts.add("Pink");
		ts.add("Red");
		ts.add("Orange");
		
		System.out.println("Original tree set: "+ts);
		
		System.out.println("Elements in Reverse Order: ");
		for(int i=ts.size()-1;i>=0;i--)
		{
			System.out.println();
		
		
		}
 

	}

}
//Test input:
//Black, Green, Pink, Red, orange
//
//
//Output:Original tree set:[Black, Green, Pink, Red, orange]
//Elements in Reverse Order:
//orange
//Red
//Pink
//Green
//Black