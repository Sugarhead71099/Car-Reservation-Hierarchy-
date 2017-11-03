public class Luxury extends Vehicle {

	private static final double DAILY_CHARGE = 58.65, DAILY_FEUL_SURCHARGE = 3.50;
	private double total;

	public Luxury(int numOfDays, boolean isAAAMember, String make, String model) {
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