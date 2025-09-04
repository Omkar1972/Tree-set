import java.util.TreeSet;

public class T11 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>();

		ts.add(10);
		ts.add(14);
		ts.add(16);
		ts.add(23);
		ts.add(25);
		ts.add(36);
		ts.add(70);
		ts.add(82);
		ts.add(89);
		
		System.out.println("Original tree set: "+ts);
		
		Integer Element = ts.pollLast();

        if (Element != null) {
            System.out.println("Removes the last element: " + Element);
        } else {
            System.out.println("TreeSet is empty.");
        }

        System.out.println("Tree set after removing last element: " + ts);
		
	
	}

}
//Test input:
//[10, 14, 16, 22, 25, 36, 70, 82, 89]
//
//
//Sample Output:Original tree set: [10, 14, 16, 22, 25, 36, 70, 82, 89]
//Removes the last element: 89
//Tree set after removing last element: [10, 14, 16, 22, 25, 36, 70, 82]