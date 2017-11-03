public class Car extends Vehicle {

	private static final double DAILY_CHARGE = 12.50, DAILY_FEUL_SURCHARGE = 00.00;
	private double total;

	public Car(int numOfDays, boolean isAAAMember, String make, String model) {
		super(numOfDays, isAAAMember, make, model);
	}
	
	@Override
	public double generateBill() {
		total += (DAILY_CHARGE * numOfDays) + (DAILY_FEUL_SURCHARGE * numOfDays);
		return total;
	}

	@Override
	public double getDailyCharge() { return DAILY_CHARGE; }

	@Override
	public double getDailyFeulSurcharge() { return DAILY_FEUL_SURCHARGE; }

}