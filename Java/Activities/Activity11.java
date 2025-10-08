import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm= new HashMap<>();
		hm.put(1, "Lavender");
		hm.put(2, "Brown");
		hm.put(3, "Yellow");
		hm.put(4, "Green");
		hm.put(5, "Black");
		
		System.out.println("All colors present in the map: "+hm);
		
		hm.remove(2);
		
		System.out.println("After removing pair ar index 2: "+hm);
		
		if(hm.containsValue("Green")) {
			System.out.println("Green exist in the map");
		}else {
			System.out.println("Green is not present in the map");
		}
		
		System.out.println("Number of pairs in the map: "+hm.size());

	}

}
