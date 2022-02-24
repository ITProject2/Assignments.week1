package assignments.week1;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "hannah";
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			//System.out.println(i);
			rev = rev + s.charAt(i);	
		}
		//System.out.println(rev);
		if(rev.equals(s)) {
			System.out.println("Palidrome");
		}
		else {
			System.out.println("Not a Palidrome");
		}
	}	
}
