package aqautics_reservations;

public class liesure_pool {
	private String lie_pool; 
	private int occupancy1; 
	private double ph1; 
	private double chlorine1; 
	private int [][][][][][][][][] lane;
	private boolean safe_entry1;
	public liesure_pool( String lie_pool, int occupancy1, double ph1, double chlorine1, boolean safe_entry1) {
		this.lie_pool = lie_pool; 
		this.occupancy1 = occupancy1; 
		this.ph1 = ph1;
		this.chlorine1 = chlorine1;
		this.lane = lane;
		
	}
	public void lie_status() {
		System.out.println(" -----------------------------");
		System.out.println("|Pool Name: " + this.lie_pool + "        |");
		System.out.println(" -----------------------------");
		System.out.println("|Pool Occupancy: " + this.occupancy1 + "        |");
		System.out.println(" -----------------------------");
		System.out.println("|Ph Levels: " + this.ph1 + "        |");
		System.out.println(" -----------------------------");
		System.out.println("|Chlorine levels: " + this.chlorine1 + "        |");
		System.out.println(" -----------------------------");
		System.out.println("|Safe_entry: " + this.safe_entry1 + "        |");
		System.out.println(" -----------------------------");
	}
}

