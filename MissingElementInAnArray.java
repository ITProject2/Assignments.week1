package assignments.week1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,7,3,9,5,2,8,4};
		
		Arrays.sort(arr);
		
		//System.out.println(Arrays.toString(arr));
		
		for(int i=arr[0]; i<=arr.length-1; i++) {
			if(i != (arr[i-1])) {
				System.out.println(i);
				break;
			}
		}

	}

}
