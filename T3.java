import java.util.TreeSet;

public class T3 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Green");
		ts.add("Orange");
		ts.add("Red");
		
		System.out.println("Tree Set1: "+ts);
		
		TreeSet<String> ts1=new TreeSet<String>();
		
		ts1.add("Black");
		ts1.add("Pink");
        ts1.add("White");
		
        System.out.println();
		System.out.println("Tree set2: "+ts1);
		
		ts.addAll(ts1);
		
		System.out.println();
		System.out.println("Tree Set1: "+ts);
	}

}
