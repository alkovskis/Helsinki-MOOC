package WeekFive;

import WeekFour.LyyraCard;

public class CashRegister {
	private double cashInRegister; // the amount of cash in the register
	private int economicalSold; // the amount of economical lunches sold
	private int gourmetSold; // the amount of gourmet lunches sold

	public CashRegister() {
		this.cashInRegister = 1000;
	}

	public double payEconomical(double cashGiven) {
		double change = 0;
		if (cashGiven >= 2.5) {
			this.cashInRegister += 2.5;
			economicalSold++;
			change = cashGiven - 2.5;
		}
		return change;
	}

	public double payGourmet(double cashGiven) {
		if (cashGiven >= 4) {
			gourmetSold++;
			this.cashInRegister += 4;
		}
		return cashGiven - 4;

	}

	public boolean payEconomical(LyyraCard card) {
		if (card.balance() >= 2.5) {
			card.pay(2.5);
			economicalSold++;
			return true;
		} else
			return false;

	}

	public boolean payGourmet(LyyraCard card) {
		if (card.balance() >= 4) {
			card.pay(4);
			gourmetSold++;
			return true;
		} else
			return false;

	}

	public void loadMoneyToCard(LyyraCard card, double sum) {
		if (sum >= 0) {
			card.loadMoney(sum);
			this.cashInRegister+=sum;
		}

	}

	public String toString() {
		return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold
				+ " gourmet lunches sold: " + gourmetSold;
	}

	public static void main(String[] args) {
		 CashRegister unicafeExactum = new CashRegister();
	        System.out.println( unicafeExactum );

	        LyyraCard cardOfJim = new LyyraCard(2);

	        System.out.println("the card balance " + cardOfJim.balance() + " euros");

	        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
	        System.out.println("payment success: " + succeeded);

	        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

	        succeeded = unicafeExactum.payGourmet(cardOfJim);
	        System.out.println("payment success: " + succeeded);

	        System.out.println("the card balance " + cardOfJim.balance() + " euros");

	        System.out.println( unicafeExactum );

	}

}
