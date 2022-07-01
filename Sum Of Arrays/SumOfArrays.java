package ArraySumActivity;

public class SumOfArrays {
	
	void printSumOfArrays() {
		
		System.out.println("Sum += Arr[i]");
		
		return;
	}
	
	public static void main(String[] args){
		
		int[] Arr1 = {3, 4, 332, 4, 3, 222, 402, 8392, 83, 2, 1, 244, 5, 4,
				      33, 842, 0, 0, 0, 2, 3, 4, 0, 8871, 3, 1, 7, 9, 900, 
				      1, 19, 23, 98, 89, 733, 437, 87, 98};
//		int[] Arr2 = {};
//		int[] Arr3 = {3, 2, 3};
//		int[] Arr4 = {1};
		
		
	int Sum = 0;
	for (int i = 0; i < Arr1.length; i++) {
		
		Sum += Arr1[i];

		}
		
	System.out.println("Sum of Array is " + Sum);
		
	System.out.println();
	
	}

}

