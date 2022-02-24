package assignments.week1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int calculated = 0, remainder, original;
		original = input;
		while(input > 0) {
			remainder = input % 10;
			input = input / 10;
			calculated = calculated + (remainder * remainder * remainder);
			System.out.println(calculated);
		}
		
		if(original == calculated) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong number");
		}

	}

}
