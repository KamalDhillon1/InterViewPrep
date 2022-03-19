package Practice;

public class MaxNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 54, 24, -4, 0, 2, 45, 54, -9, 7 };
		
		// assign first array element to two variables
		int largest = arr[0];
		int smallest = arr[0];
		
		
		
		
		// iterate and compare from array index 1
		for (int i = 1; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			} else if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		
		System.out.println("Maximum number = " + largest + " Minimum number = " + smallest);
	}

}
