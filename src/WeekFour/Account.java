package WeekFour;

public class Account {
	int deposit=20;
	double balance;
	
	public Account(String text,double balance) {
		this.balance=balance;
		
	}

	public double balance() {
		return balance;
	}

	public int deposit(int d) {
		return d;
	}
	public double withdrawal(int w) {
		return balance-w;
	}

}
