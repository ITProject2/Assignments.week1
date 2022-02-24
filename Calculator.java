package assignments.week1;

public class Calculator{
	
	public void add(int n1, int n2, int n3) {
		int sum = n1+n2+n3;
		System.out.println(sum);
	}
	
	public void sub(int n1, int n2) {
		int res = n1-n2;
		System.out.println(res);
	}
	
	public void mul(double n1, double n2) {
		double ans = n1*n2;
		System.out.println(ans);
	}
	
	public void divide(float n1, float n2) {
		float div = n1/n2;
		System.out.println(div);
	}

}
