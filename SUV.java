public class SUV extends Vehicle {

	private static final double DAILY_CHARGE = 24.75, DAILY_FEUL_SURCHARGE = 1.50;
	private double total;

	public SUV(int numOfDays, boolean isAAAMember, String make, String model) {
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