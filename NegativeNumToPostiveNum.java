package assignments.week1;

public class NegativeNumToPostiveNum {

	public static void main(String[] args) {
		int n = -1409;
		
		if(n < 0) {
			n = -(n);
			System.out.println("The number -" + n + " is converted to " +n);
		}
		else {
			System.out.println("Already a Postive Number");
		}

	}

}
