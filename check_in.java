package aqautics_reservations;

public class check_in {
	public boolean checkin( String comp_pool,int occupancy, double ph, double chlorine, boolean safe_entry) {
		if (ph >= 9 || ph <= 4) {
			safe_entry = false;
		}else if ( ph >= 4 || ph <= 9) {
			if (chlorine >= 5 && chlorine <= 2) {
				safe_entry = false;
			}else if (ph <= 5 && ph >= 2) {
				safe_entry = true;
			}
		}
		return safe_entry;
	}

}
