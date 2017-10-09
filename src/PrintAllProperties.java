import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PrintAllProperties {
	PrintAllProperties(){}
	int noOfApartment=3, noOfHouse=3, noOfLux = 3, noRentProperty = 3;
	
	public void PrintAll(ArrayList<Property> apartment, ArrayList<Property> house, ArrayList<Property> luxury_villa){
		//region output: apartment
		for(int a=0;a<noOfApartment;a++){
			int n = a+1;
			JOptionPane.showMessageDialog(null, "Summary for Apartment " + n + ":" + "\n\n" 
			+ "Registration Number: " + apartment.get(a).getRegNo() + "\n"
			+ "Owner's Name: " + apartment.get(a).getOwnerName() + "\n"
			+ "Postal Address: " + apartment.get(a).getPostalAddress() + "\n"
			+ "Rental Cost Per Day: " + apartment.get(a).getRentalCostPerDay() + "\n"
			+ "Storey Number: " + ((Apartment) apartment.get(a)).getStoreyNo() + "\n"
			+ "Number of Bed: " + ((Apartment) apartment.get(a)).getNoOfBed() + "\n"
			+ "Total Number of Season's Rental Day: " + apartment.get(a).getTotalNoSeasonRentalDay() + "\n"
			);
		}
		
		//region output: house
		for(int a=0;a<noOfHouse;a++){
			int n = a+1;
			JOptionPane.showMessageDialog(null, "Summary for House " + n + ":" + "\n\n" 
			+ "Registration Number: " + house.get(a).getRegNo() + "\n"
			+ "Owner's Name: " + house.get(a).getOwnerName() + "\n"
			+ "Postal Address: " + house.get(a).getPostalAddress() + "\n"
			+ "Rental Cost Per Day: " + house.get(a).getRentalCostPerDay() + "\n"
			+ "Total Number of Storey: " + ((House) house.get(a)).getTotalNoOfStorey() + "\n"
			+ "Clearing Fees: " + ((House) house.get(a)).getClearingFees() + "\n"
			+ "Total Number of Season's Rental Day: " + house.get(a).getTotalNoSeasonRentalDay() + "\n"
			);
		}
		
		//region output: luxury villa
		for(int a=0;a<noOfLux;a++){
			int n = a+1;
			JOptionPane.showMessageDialog(null, "Summary for Luxury Villa " + n + ":" + "\n\n" 
			+ "Registration Number: " + luxury_villa.get(a).getRegNo() + "\n"
			+ "Owner's Name: " + luxury_villa.get(a).getOwnerName() + "\n"
			+ "Postal Address: " + luxury_villa.get(a).getPostalAddress() + "\n"
			+ "Rental Cost Per Day: " + luxury_villa.get(a).getRentalCostPerDay() + "\n"
			+ "Total Number of Rooms: " + ((Luxury_Villa) luxury_villa.get(a)).getTotalNoOfRooms() + "\n"
			+ "Room Service Cost Per Day: " + ((Luxury_Villa) luxury_villa.get(a)).getRoomServiceCostPerDay() + "\n"
			+ "Luxury Tax Per Day: " + ((Luxury_Villa) luxury_villa.get(a)).getLuxuryTaxPerDay() + "\n"
			+ "Total Number of Season's Rental Day: " + luxury_villa.get(a).getTotalNoSeasonRentalDay() + "\n"
			);
		}
	}
	
}
