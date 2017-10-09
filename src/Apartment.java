public class Apartment extends Property{
	private int storeyNo;
	private int noOfBed;
	
	public Apartment(int regNo, String ownerName, String postalAddress, double rentalCostPerDay, 
					 int totalNoSeasonRentalDay, int storeyNo, int noOfBed) {
		
		super(regNo, ownerName, postalAddress, rentalCostPerDay, totalNoSeasonRentalDay);
		this.setStoreyNo(storeyNo);
		this.setNoOfBed(noOfBed);
	}
	
	
	public int getStoreyNo(){
		return this.storeyNo;
	}
	
	public int getNoOfBed(){
		return this.noOfBed;
	}
	
	public void setStoreyNo(int newStoreyNo){
		this.storeyNo = newStoreyNo;
	}
	
	public void setNoOfBed(int newNoOfBed){
		this.noOfBed = newNoOfBed;
	}

}
