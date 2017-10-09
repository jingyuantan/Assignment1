public class Luxury_Villa extends Property {

	private int totalNoOfRooms;
	private double roomServiceCostPerDay;
	private double luxuryTaxPerDay;
	
	public Luxury_Villa(int regNo, String ownerName, String postalAddress, double rentalCostPerDay,
						int totalNoSeasonRentalDay, int totalNoOfRooms, double roomServiceCostPerDay, double luxuryTaxPerDay) {
		
		super(regNo, ownerName, postalAddress, rentalCostPerDay, totalNoSeasonRentalDay);
		
		this.setTotalNoOfRooms(totalNoOfRooms);
		this.setRoomServiceCostPerDay(roomServiceCostPerDay);
		this.setLuxuryTaxPerDay(luxuryTaxPerDay);
	}
	
	public int getTotalNoOfRooms(){
		return this.totalNoOfRooms;
	}
	
	public double getRoomServiceCostPerDay(){
		return this.roomServiceCostPerDay;
	}
	
	public double getLuxuryTaxPerDay(){
		return this.luxuryTaxPerDay;
	}
	
	public void setTotalNoOfRooms(int newTotalNoOfRooms){
		this.totalNoOfRooms = newTotalNoOfRooms;
	}
	
	public void setRoomServiceCostPerDay(double newRoomServiceCostPerDay){
		this.roomServiceCostPerDay = newRoomServiceCostPerDay;
	}
	
	public void setLuxuryTaxPerDay(double newLuxuryTaxPerDay){
		this.luxuryTaxPerDay = newLuxuryTaxPerDay;
	}

}
