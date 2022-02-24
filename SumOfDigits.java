package assignments.week1;

public class SumOfDigits {

	public static void main(String[] args) {
		int input = 123;
		int sum = 0;
		int remainder;
		while(input>0) {
			remainder= input%10;
			input =input/10;
			sum = sum + remainder;
		}
		
		System.out.println(sum);
		
	}

}
