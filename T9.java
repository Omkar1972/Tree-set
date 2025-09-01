import java.util.TreeSet;

public class T9 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(1);
		ts.add(2);
        ts.add(3);
//		ts.add(4);
		ts.add(5);
		ts.add(6);
		
		
		System.out.println(ts);
		
		TreeSet<Integer> ti=new TreeSet(ts.headSet(7));
		
		System.out.println();
		System.out.println("Tree set data: ");
		for(Integer s:ti)
		{
			System.out.println(s);
		}
		
		
	}

}
//Test input:
//1 2 3 5 6 
//
//
//Sample Output:Tree set data: 
//1
//2
//3
//5
//6