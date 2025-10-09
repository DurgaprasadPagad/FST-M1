import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		ArrayList<Integer> list= new ArrayList<Integer>();
		Random indexGen= new Random();
		
		System.out.print("Enter the number to store in an array: ");
		System.out.println("(EOF or not integer to terminate): ");
		
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		
		Integer nums[]= list.toArray(new Integer[0]);
		int index=indexGen.nextInt(nums.length);
		System.out.println("Index value generated: "+ index);
		System.out.println("Value of the element at generated index: "+nums[index]);
		
		scan.close();
		
	}

}
