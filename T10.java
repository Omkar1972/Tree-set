import java.util.TreeSet;

public class T10 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(10);
		ts.add(22);
		ts.add(36);
		ts.add(25);
		ts.add(16);
		ts.add(70);
		ts.add(82);
		ts.add(89);
		ts.add(14);
		
		System.out.println(ts);
		
		
	}

}
//Test input:
//10,22,36,25,16,70,82,89,14
//
//Sample output:
//Less than or equal to 86 : 82
//Less than or equal to 29 : 25