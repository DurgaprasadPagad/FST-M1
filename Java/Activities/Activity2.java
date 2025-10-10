
public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 77, 10, 54, -11, 10};
		int searchNum=10;
		int fixedSum=30;
		
		int sum=0;
		for(int num:arr) {
			if(num==searchNum) {
				sum=sum+num;
			}
		}
		System.out.println("Sum of all the 10's: "+sum);
		
		if(fixedSum==sum) {
			System.out.println("The value of fixed sum and actucal sum is True.");
		}else {
			System.out.println("The value of fixed sum and actucal sum is False.");
		}
	}

}
