package assignments.week1;

public class FibonnaciSeries {

	public static void main(String[] args) {
		int range = 8; 
		int a = 0;
		int b = 1;
		int sum = 0;
		
		System.out.println(a);
		
		for(int i=1; i<range; i++) {
			sum = a + b;
			b = a;
			a = sum;
			System.out.println(sum);
				
		}
	}

}
