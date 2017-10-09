public class Property {
	private int regNo;
	private String ownerName;
	private String postalAddress;
	private double rentalCostPerDay;
	private int totalNoSeasonRentalDay = 0;
	
	public Property(int regNo, String ownerName, String postalAddress, double rentalCostPerDay, int totalNoSeasonRentalDay){
		this.setRegNo(regNo);
		this.setOwnerName(ownerName);
		this.setPostalAddress(postalAddress);
		this.setRentalCostPerDay(rentalCostPerDay);
		this.setTotalNoSeasonRentalDay(totalNoSeasonRentalDay);
	}
	
	public int getRegNo(){
		return this.regNo;
	}
	
	public String getOwnerName(){
		return this.ownerName;
	}
	
	public String getPostalAddress(){
		return this.postalAddress;
	}
	
	public double getRentalCostPerDay(){
		return this.rentalCostPerDay;
	}
	
	public int getTotalNoSeasonRentalDay(){
		return this.totalNoSeasonRentalDay;
	}
	
	public void setRegNo(int newRegno){
		this.regNo = newRegno;
	}
	
	public void setOwnerName(String newOwnerName){
		this.ownerName = newOwnerName;
	}
	
	public void setPostalAddress(String newPostalAddress){
		this.postalAddress = newPostalAddress;
	}
	
	public void setRentalCostPerDay(double newRentalCostPerDay){
		this.rentalCostPerDay = newRentalCostPerDay;
	}
	
	public void setTotalNoSeasonRentalDay(int newTotalNoSeasonRentalDay){
		this.totalNoSeasonRentalDay = newTotalNoSeasonRentalDay;
	}
	
	public void RentProperty(int RentalDays){
		this.totalNoSeasonRentalDay += RentalDays;
	} 
}
