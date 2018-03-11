package weekEleven;


public class PersonalCalculator implements Calculator {

	private int value = 0;

	public void increase(){
		value++;
	}

	public int giveValue() {
		return this.value;
	}
	public static void main(String[] args) {
		Calculator calc = new PersonalCalculator();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());
	}

}
