import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,7,9,3,1};
		System.out.println("Array before sorting: "+Arrays.toString(arr));
		
		ascendingSort(arr);
		System.out.println("Sorted array in ascending order: "+Arrays.toString(arr));
		

	}

	private static void ascendingSort(int[] arr) {
		// TODO Auto-generated method stub
		int size=arr.length;
		
		for(int i=1; i<size; i++) {
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && key<arr[j]) {
				arr[j+1]=arr[j];
				--j;
			}
			arr[j+1]=key;
		}
		
	}

}
