import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs= new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		
		System.out.println("Size of elements in set: "+hs.size());
		
		hs.remove(3);
		
		if(hs.remove(7)) {
			System.out.println("7 removed from the list");
		}else {
			System.out.println("7 is not present in the set");
		}
		
		System.out.println("is 4 present in the set: "+ hs.contains(4));
		System.out.println("Updated set: "+hs);

	}

}
