package test;

public class Main {
	public  int zeros(int n) {
		int count = n;
		int zero = 0;
		while (count > 0) {
			if (count % 5 == 0 || count % 10 == 0) {
				zero++;
			}
			count--;
		}
		// your beatiful code here
		System.out.println(zero);
		return zero;
	}
	
	public  long zeros1(long a) {
		long c=a;
		long sum=1;
		while(c>0) {
			sum=sum*c;
			c--;
		}
		System.out.println(sum);
		return sum;
	}
	
	

	public static void main(String[] args) {
		Main m=new Main();
		m.zeros1(22);
		m.zeros(20);

	}

}
