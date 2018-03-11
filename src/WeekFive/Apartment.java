package WeekFive;

public class Apartment {

	private int rooms;
	private int squareMeters;
	private int pricePerSquareMeter;

	public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
		this.rooms = rooms;
		this.squareMeters = squareMeters;
		this.pricePerSquareMeter = pricePerSquareMeter;
	}

	public boolean larger(Apartment otherAparment) {
		if (this.squareMeters > otherAparment.squareMeters) {
			return true;
		} else
			return false;
	}

	public int priceDifference(Apartment otherApartment) {
		int dif;
		int first = this.squareMeters * this.pricePerSquareMeter;
		int second = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
		if (first > second) {
			dif = first - second;
		} else {
			dif = second - first;
		}
		return dif;
	}

	public boolean moreExpensiveThan(Apartment otherApartment) {
		if (this.squareMeters * this.pricePerSquareMeter > otherApartment.squareMeters
				* otherApartment.pricePerSquareMeter) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		Apartment studioManhattan = new Apartment(1, 16, 5500);
		Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
		Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

		System.out.println(studioManhattan.larger(twoRoomsBrooklyn)); // false
		System.out.println(fourAndKitchenBronx.larger(twoRoomsBrooklyn)); // true
		System.out.println(studioManhattan.priceDifference(twoRoomsBrooklyn)); // 71600
		System.out.println(fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn)); // 35400
		System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );       // false
		System.out.println( fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn) );   // true

	}

}
