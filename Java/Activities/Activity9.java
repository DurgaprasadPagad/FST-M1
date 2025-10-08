import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList= new ArrayList<String>();
		myList.add("Red");
		myList.add("Green");
		myList.add("Blue");
		myList.add("Maroon");
		myList.add("Grey");
		
		System.out.println("Printing all the colors using enhanced for loop");
		for(String c:myList) {
			System.out.println(c);
		}
		
		System.out.println("3rd element in myList: "+myList.get(2));
		System.out.println("Is Maroon present in myList: "+myList.contains("Maroon"));
		System.out.println("Size of myList: "+myList.size());
		
		myList.remove(3);
		System.out.println("Size of myList after removing an element: "+myList.size());
	}

}
