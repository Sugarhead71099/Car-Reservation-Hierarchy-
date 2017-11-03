import java.io.*;

public class Driver {

	public static void main(String[] args) throws IOException {
		FileWriter inputFile = new FileWriter("customer_reservations");
		inputFile.write("Pat Fox 35 SUV Mazda Five 10 true true cash\n");
		inputFile.write("Rick Berry 22 Car Honda Civic 3 false false credit\n");
		/*inputFile.write("Susie Homemaker 38 SUV Chevy Suburban 6 true true check\n");
		inputFile.write("Mike Hotwheels 24 Luxury Chevy Corvette 3 true false credit\n");
		inputFile.write("Sam Smith 64 Car Chevy Malibu 10 false false check\n");
		inputFile.write("Vicky Moeller 27 Luxury Mercedes Benz 8 true true credit\n");*/
		inputFile.close();
		DailyCustomer dC = new DailyCustomer();
		dC.makeRecipt();
		FileWriter outputFile = new FileWriter("customer_recipts");
		for(Reservation reservation : DailyCustomer.getReservations())
			outputFile.write(reservation.toString());
		outputFile.close();
	}

}