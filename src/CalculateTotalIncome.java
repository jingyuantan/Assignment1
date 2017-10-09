import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CalculateTotalIncome {
	CalculateTotalIncome(){}
	
	int noOfApartment=3, noOfHouse=3, noOfLux = 3, noRentProperty = 3;
	
	public void CalcTotalIncome(ArrayList<Property> apartment, ArrayList<Property> house, ArrayList<Property> luxury_villa){
		//region calculate total income: apartment
		double totalAll = 0;
		for(int a=0;a<noOfApartment;a++){
			double totalIncome = apartment.get(a).getRentalCostPerDay() * apartment.get(a).getTotalNoSeasonRentalDay();
			totalAll += totalIncome;
			JOptionPane.showMessageDialog(null, "Total income for Apartment with Registration Number " + apartment.get(a).getRegNo() + ":" + "\n\n" + "€" + totalIncome);
		}
		
		//region calculate total income: house
		for(int a=0;a<noOfHouse;a++){
			double totalIncome = (house.get(a).getRentalCostPerDay() * house.get(a).getTotalNoSeasonRentalDay())
								+ ((House) house.get(a)).getClearingFees();
			totalAll += totalIncome;
			JOptionPane.showMessageDialog(null, "Total income for House with Registration Number " + house.get(a).getRegNo() + ":" + "\n\n" + "€" + totalIncome);
		}
		
		//region calculate total income: luxury villa
		for(int a=0;a<noOfLux;a++){
			double totalIncome = (luxury_villa.get(a).getRentalCostPerDay() + ((Luxury_Villa)luxury_villa.get(a)).getRoomServiceCostPerDay() 
								+ ((Luxury_Villa)luxury_villa.get(a)).getLuxuryTaxPerDay()) * luxury_villa.get(a).getTotalNoSeasonRentalDay();
			totalAll += totalIncome;		
			JOptionPane.showMessageDialog(null, "Total income for Luxury Villa with Registration Number " + luxury_villa.get(a).getRegNo() + ":" + "\n\n" + "€" + totalIncome);
		}
		JOptionPane.showMessageDialog(null, "Total income for all properties is: " + "\n\n" + "€" + totalAll);
	}
}
