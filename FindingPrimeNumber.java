package assignments.week1;

public class FindingPrimeNumber {

	public static void main(String[] args) {
		int a = 26;
		boolean flag = false;
		int count = 0;
		
		for(int i=2; i<=a; i++) {
			//System.out.println(a%i);

			if(a % i == 0)
			{
				flag = true;
				count++;
			}
			
		}
		
		if(flag == true && count == 1) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime number");
		}

	}

}
