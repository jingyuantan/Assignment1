public class House extends Property {
	
	private int totalNoOfStorey;
	private double clearingFees;
	
	public House(int regNo, String ownerName, String postalAddress, double rentalCostPerDay, 
				 int totalNoSeasonRentalDay, int totalNoOfStorey, double clearingFees) {
		
		super(regNo, ownerName, postalAddress, rentalCostPerDay, totalNoSeasonRentalDay);
		this.setTotalNoOfStorey(totalNoOfStorey);
		this.setClearingFees(clearingFees);
	}
	
	public int getTotalNoOfStorey(){
		return this.totalNoOfStorey;
	}
	
	public double getClearingFees(){
		return this.clearingFees;
	}
	
	public void setTotalNoOfStorey(int newTotalNoOfStorey){
		this.totalNoOfStorey = newTotalNoOfStorey;
	}
	
	public void setClearingFees(double newTotalNoOfStorey){
		this.clearingFees = newTotalNoOfStorey;
	}

}
