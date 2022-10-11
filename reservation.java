package aqautics_reservations;
import java.util.Scanner;
public class reservation {

	public static void main(String [] args) {
		int hour = 1;
		int total_shutdowns = 0;
		int headcount = 0;
		for (hour = 5; hour <= 20; hour++) {
			System.out.println(hour + ":00 O'clock" );
			boolean safe_entry = true;
			Scanner scnr = new Scanner(System.in);
			System.out.println("Please enter the name of the pool you will be reporting ");
			String comp_pool = scnr.nextLine();
			System.out.println("Please enter the occupancy of the pool");
			int occupancy = Integer.parseInt(scnr.nextLine());
			headcount = headcount + occupancy;
			System.out.println("Please enter the Ph level of the pool");
			double ph = Double.parseDouble(scnr.nextLine());
			System.out.println("Please enter the Chlorine level of the pool");
			double chlorine = Double.parseDouble(scnr.nextLine());
			checkin(ph, chlorine, safe_entry, total_shutdowns);
			competition_pool comp_hour1 = new competition_pool(comp_pool, occupancy, ph, chlorine, safe_entry, headcount, total_shutdowns);
			comp_hour1.status();
			if (hour == 21) {
				comp_hour1.end_day();
			}
		}
		
		
		}
				
	public static boolean checkin(double ph, double chlorine, boolean safe_entry, int total_shutdowns) {
		if (ph >= 9 || ph <= 4) {
			safe_entry = false;
			total_shutdowns = total_shutdowns + 1;
		
		}else if ( ph >= 4 && ph <= 9) {
			if (chlorine >= 5 || chlorine <= 2) {
				safe_entry = false;
				total_shutdowns = total_shutdowns + 1;
			}else if (chlorine <= 5 && chlorine >= 2) {
				safe_entry = true;
			}
		}
		return safe_entry;
	}
}
