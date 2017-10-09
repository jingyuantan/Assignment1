import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Property> apartment = new ArrayList<Property>();
		ArrayList<Property> house = new ArrayList<Property>();
		ArrayList<Property> luxury_villa = new ArrayList<Property>();
		
		FillInProperties FillInProp = new FillInProperties();
		PrintAllProperties PrintAll = new PrintAllProperties();
		CalculateTotalIncome CalcTotalIncome = new CalculateTotalIncome();
		
		FillInProp.FillInProp(apartment, house, luxury_villa);		
		PrintAll.PrintAll(apartment, house, luxury_villa);
		CalcTotalIncome.CalcTotalIncome(apartment, house, luxury_villa);
		
		System.exit(0);
	}
	
}
