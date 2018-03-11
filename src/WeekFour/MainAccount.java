package WeekFour;

public class MainAccount {
	public static void main(String[] args) {
		Account bartosAccount = new Account("Barto's account", 100.00);
		Account bartosSwissAccount = new Account("Barto's account in Switzerland", 1000000.00);
		Account mattsAccount= new Account("Matts`s account", 1000.00);
		Account myAccount=new Account("My account", 0);

		System.out.println("Initial state");
		System.out.println(bartosAccount);
		System.out.println(bartosSwissAccount);

		bartosAccount.withdrawal(20);
		System.out.println("Barto's account balance is now: " + bartosAccount.balance());
		bartosSwissAccount.deposit(200);
		System.out.println("Barto's Swiss account balance is now: " + bartosSwissAccount.balance());
		System.out.println("Matts's account balance is now: " + mattsAccount.balance());
		System.out.println("My account balance is now: " + myAccount.balance());

		System.out.println("Final state");
		System.out.println(bartosAccount);
		System.out.println(bartosSwissAccount);
	}

}
