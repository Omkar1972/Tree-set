import java.util.TreeSet;

public class T6 {

	public static void main(String[] args) {
    TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Black");
		ts.add("Green");
		ts.add("Orange");
		ts.add("Red");
		ts.add("White");
		
		System.out.println("Tree set: "+ts);

		
		
		System.out.println("Cloned tree list: "+ts.clone());
	}

}
//Test input:
//[Black, Green, Pink, Red, orange] 
//
//[Black, Green, Pink, Red, orange] 
//
//
//Sample Output:Original tree set:[Black, Green, Pink, Red, orange] 
//Cloned tree list: [Black, Green, Pink, Red, orange]