import java.util.Arrays;
import java.util.Collections;

public class DecreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
		System.out.println("Original Array: " + Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Sorted Array: " + Arrays.toString(arr));
		
		
		

	}

}
