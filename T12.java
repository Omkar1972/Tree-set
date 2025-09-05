import java.util.TreeSet;

public class T12 {

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
		
		System.out.println("Original tree set: "+ts);
		
		Integer Remove = 70;

	        // Remove the element
	        boolean removed = ts.remove(Remove);

	        if (removed) {
	            System.out.println("Removes '" + Remove + "' from the list: true");
	        } else {
	            System.out.println("Element '" + Remove + "' not found in the TreeSet.");
	        }

	        System.out.println("Tree set after removing last element: " + ts);
		

	}

}
//Test input:
//[10, 14, 16, 22, 25, 36, 70, 82, 89] 
//
//
//Sample Output:Original tree set: [10, 14, 16, 22, 25, 36, 70, 82, 89] 
//Removes 70 from the list: true
//Tree set after removing last element: [10, 14, 16, 22, 25, 36, 82, 89]