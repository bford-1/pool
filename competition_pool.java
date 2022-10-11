package aqautics_reservations;

public class competition_pool {
	private String comp_pool; 
	private int occupancy; 
	private double ph; 
	private double chlorine; 
	private int [][][][][][][][][] lane;
	private boolean safe_entry;
	int headcount;
	int total_shutdowns;
	public competition_pool( String comp_pool, int occupancy, double ph, double chlorine, boolean safe_entry, int headcount, int total_shutdowns) {
		this.comp_pool = comp_pool; 
		this.occupancy = occupancy; 
		this.ph = ph;
		this.chlorine = chlorine;
		this.lane = lane;
		this.headcount = headcount;
		this.total_shutdowns = total_shutdowns;
		
	}
	public void status() {
		System.out.println(" -----------------------------");
		System.out.println("|Pool Name: " + this.comp_pool + "        |");
		System.out.println(" -----------------------------");
		System.out.println("|Pool Occupancy: " + this.occupancy + "        |");
		System.out.println(" -----------------------------");
		System.out.println("|Ph Levels: " + this.ph + "        |");
		System.out.println(" -----------------------------");
		System.out.println("|Chlorine levels: " + this.chlorine + "        |");
		System.out.println(" -----------------------------");
		System.out.println("|Safe_entry: " + this.safe_entry + "        |");
		System.out.println(" -----------------------------");
	}
	public void end_day() {
		System.out.println("_______________________________");
		System.out.println("|End of Day report            |");
		System.out.println("|total patrons of the day: " + this.headcount);
		System.out.println("|total shutdowns of the day: " + this.total_shutdowns);
		System.out.println("|_____________________________|");
	}
}
	