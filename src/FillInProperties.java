import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FillInProperties {
	FillInProperties(){}
	int noOfApartment=3, noOfHouse=3, noOfLux = 3, noRentProperty = 3;
	int totalNoSeasonRentalDay = 0;
	
	public void FillInProp(ArrayList<Property> apartment, ArrayList<Property> house, ArrayList<Property> luxury_villa){
		//General attributes
		String ownerName, postalAddress, input = "";
		int regNo = 0;
		double rentalCostPerDay;
		boolean checkUnique = true;
		
		
		//apartment additional attributes
		int storeyNo, noOfBed;
		
		//house additional attributes
		int totalNoOfStorey;
		double clearingFees;
		
		//luxury villa additional attributes
		int totalNoOfRooms;
		double roomServiceCostPerDay, luxuryTaxPerDay;
		
		//region input: apartment
		if(noOfApartment>0){
			for(int a=0;a<noOfApartment;a++){
				int n = a+1;
				JOptionPane.showMessageDialog(null, "Please insert the details for Apartment " + n);
				do{
					checkUnique = true;
					input = JOptionPane.showInputDialog("Enter Registration Number");
					try{
						regNo = Integer.parseInt(input);
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
						continue;
					}
					if(a>0){
						for(int i=0;i<a;i++){
							if(regNo == apartment.get(i).getRegNo()){
							//if(regNo == apartment[i].getRegNo()){
								JOptionPane.showMessageDialog(null, "Invalid input, Registration Number must be unique.");
								checkUnique = true;
								break;
							}
							else{
								checkUnique = false;
							}
						}
						if(!checkUnique){
							break;
						}
					}
					else{
						break;
					}
				}while(checkUnique);
				
				ownerName = "";
				while(ownerName.isEmpty()){
					ownerName = JOptionPane.showInputDialog("Insert Owner's Name");
					if(ownerName.isEmpty()){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				postalAddress = "";
				while(postalAddress.isEmpty()){
					postalAddress = JOptionPane.showInputDialog("Insert Postal Address");
					if(postalAddress.isEmpty()){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				while(true){
					input = JOptionPane.showInputDialog("Enter Rental Cost Per Day");
					try{
						rentalCostPerDay = Double.parseDouble(input);
						break;
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				while(true){
					input = JOptionPane.showInputDialog("Enter Storey Number");
					try{
						storeyNo = Integer.parseInt(input);
						break;
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				while(true){
					input = JOptionPane.showInputDialog("Enter Number of Bed");
					try{
						noOfBed = Integer.parseInt(input);
						break;
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				Apartment ap = new Apartment(regNo, ownerName, postalAddress, rentalCostPerDay, totalNoSeasonRentalDay, storeyNo, noOfBed);
				
				ap.setRegNo(regNo);
				ap.setOwnerName(ownerName);
				ap.setPostalAddress(postalAddress);
				ap.setRentalCostPerDay(rentalCostPerDay);
				ap.setStoreyNo(storeyNo);
				ap.setNoOfBed(noOfBed);
				
				apartment.add(ap);
			}
		}
		
		//region input: house
		if(noOfHouse>0){
			for(int a=0;a<noOfHouse;a++){
				int n = a+1;
				JOptionPane.showMessageDialog(null, "Please insert the details for House " + n);
				do{
					checkUnique = true;
					input = JOptionPane.showInputDialog("Enter Registration Number");
					try{
						regNo = Integer.parseInt(input);
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
						continue;
					}
					if(a>0){
						for(int i=0;i<a;i++){
							if(regNo == house.get(i).getRegNo()){
								JOptionPane.showMessageDialog(null, "Invalid input, Registration Number must be unique.");
								checkUnique = true;
								break;
							}
							else{
								checkUnique = false;
							}
						}
						if(checkUnique){
							continue;
						}else{
							for(int z=0;z<noOfApartment;z++){
								if(regNo == apartment.get(z).getRegNo()){
									JOptionPane.showMessageDialog(null, "Invalid input, Registration Number must be unique.");
									checkUnique = true;
									break;
								}
								else{
									checkUnique = false;
								}
							}
							if(!checkUnique){
								break;
							}
						}
						
					}
					else{
						for(int z=0;z<noOfApartment;z++){
							if(regNo == apartment.get(z).getRegNo()){
								JOptionPane.showMessageDialog(null, "Invalid input, Registration Number must be unique.");
								checkUnique = true;
								break;
							}
							else{
								checkUnique = false;
							}
						}
					}
				}while(checkUnique);
				
				ownerName = "";
				while(ownerName.isEmpty()){
					ownerName = JOptionPane.showInputDialog("Insert Owner's Name");
					if(ownerName.isEmpty()){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				postalAddress = "";
				while(postalAddress.isEmpty()){
					postalAddress = JOptionPane.showInputDialog("Insert Postal Address");
					if(postalAddress.isEmpty()){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				while(true){
					input = JOptionPane.showInputDialog("Enter Rental Cost Per Day");
					try{
						rentalCostPerDay = Double.parseDouble(input);
						break;
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				while(true){
					input = JOptionPane.showInputDialog("Enter Total Number of Storey");
					try{
						totalNoOfStorey = Integer.parseInt(input);
						break;
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				while(true){
					input = JOptionPane.showInputDialog("Enter Clearing Fees");
					try{
						clearingFees = Double.parseDouble(input);
						break;
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				House h = new House(regNo, ownerName, postalAddress, rentalCostPerDay, totalNoSeasonRentalDay, totalNoOfStorey, clearingFees);
				
				h.setRegNo(regNo);
				h.setOwnerName(ownerName);
				h.setPostalAddress(postalAddress);
				h.setRentalCostPerDay(rentalCostPerDay);
				h.setTotalNoOfStorey(totalNoOfStorey);
				h.setClearingFees(clearingFees);
				
				house.add(h);
			}
		}
		
		//region input: luxury villa
		if(noOfLux>0){
			for(int a=0;a<noOfLux;a++){
				int n = a+1;
				JOptionPane.showMessageDialog(null, "Please insert the details for Luxury Villa" + n);
				do{
					checkUnique = true;
					input = JOptionPane.showInputDialog("Enter Registration Number");
					try{
						regNo = Integer.parseInt(input);
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
						continue;
					}
					if(a>0){
						for(int i=0;i<a;i++){
							if(regNo == luxury_villa.get(i).getRegNo()){
								JOptionPane.showMessageDialog(null, "Invalid input, Registration Number must be unique.");
								checkUnique = true;
								break;
							}
							else{
								checkUnique = false;
							}
						}
						if(checkUnique){
							continue;
						}
						else{
							for(int z=0;z<noOfApartment;z++){
								if(regNo == apartment.get(z).getRegNo()){
									JOptionPane.showMessageDialog(null, "Invalid input, Registration Number must be unique.");
									checkUnique = true;
									break;
								}
								else{
									checkUnique = false;
								}
							}
							if(checkUnique){
								continue;
							}
							for(int y=0;y<noOfHouse;y++){
								if(regNo == house.get(y).getRegNo()){
									JOptionPane.showMessageDialog(null, "Invalid input, Registration Number must be unique.");
									checkUnique = true;
									break;
								}
								else{
									checkUnique = false;
								}
							}
							if(checkUnique){
								continue;
							}
						}
						if(!checkUnique){
							break;
						}
					}
					else{
						for(int z=0;z<noOfApartment;z++){
							if(regNo == apartment.get(z).getRegNo()){
								JOptionPane.showMessageDialog(null, "Invalid input, Registration Number must be unique.");
								checkUnique = true;
								break;
							}
							else{
								checkUnique = false;
							}
						}
						if(checkUnique){
							continue;
						}
						for(int y=0;y<noOfHouse;y++){
							if(regNo == house.get(y).getRegNo()){
								JOptionPane.showMessageDialog(null, "Invalid input, Registration Number must be unique.");
								checkUnique = true;
								break;
							}
							else{
								checkUnique = false;
							}
						}
						if(checkUnique){
							continue;
						}
					}
				}while(checkUnique);
				
				ownerName = "";
				while(ownerName.isEmpty()){
					ownerName = JOptionPane.showInputDialog("Insert Owner's Name");
					if(ownerName.isEmpty()){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				postalAddress = "";
				while(postalAddress.isEmpty()){
					postalAddress = JOptionPane.showInputDialog("Insert Postal Address");
					if(postalAddress.isEmpty()){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				while(true){
					input = JOptionPane.showInputDialog("Enter Rental Cost Per Day");
					try{
						rentalCostPerDay = Double.parseDouble(input);
						break;
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				while(true){
					input = JOptionPane.showInputDialog("Enter Total Number of Rooms");
					try{
						totalNoOfRooms = Integer.parseInt(input);
						break;
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				while(true){
					input = JOptionPane.showInputDialog("Enter Room Service Cost Per Day");
					try{
						roomServiceCostPerDay = Double.parseDouble(input);
						break;
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				
				while(true){
					input = JOptionPane.showInputDialog("Enter Luxury Tax Per Day");
					try{
						luxuryTaxPerDay = Double.parseDouble(input);
						break;
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				Luxury_Villa lv = new Luxury_Villa(regNo, ownerName, postalAddress, rentalCostPerDay, 
						totalNoSeasonRentalDay, totalNoOfRooms, roomServiceCostPerDay, luxuryTaxPerDay);
				
				lv.setRegNo(regNo);
				lv.setOwnerName(ownerName);
				lv.setPostalAddress(postalAddress);
				lv.setRentalCostPerDay(rentalCostPerDay);
				lv.setTotalNoOfRooms(totalNoOfRooms);
				lv.setRoomServiceCostPerDay(roomServiceCostPerDay);
				lv.setLuxuryTaxPerDay(luxuryTaxPerDay);
				
				luxury_villa.add(lv);
			}
		}
		
		//region input of rental days: apartment
		for(int a=0;a<noOfApartment;a++){
			totalNoSeasonRentalDay = 0;
			for(int b=0;b<noRentProperty;b++){
				int n = b+1;
				int RentalDays = 0;
				while(true){
					input = JOptionPane.showInputDialog(n + ". " + "Insert number of rental days for Apartment with Registration Number " + apartment.get(a).getRegNo());
					try{
						RentalDays = Integer.parseInt(input);
						break;
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				apartment.get(a).RentProperty(RentalDays);	
			}
		}
		
		//region input of rental days: house
		for(int a=0;a<noOfHouse;a++){
			totalNoSeasonRentalDay = 0;
			for(int b=0;b<noRentProperty;b++){
				int n = b+1;
				int RentalDays = 0;
				while(true){
					input = JOptionPane.showInputDialog(n + ". " + "Insert number of rental days for House with Registration Number " + house.get(a).getRegNo());
					try{
						RentalDays = Integer.parseInt(input);
						break;
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				house.get(a).RentProperty(RentalDays);	
			}
		}
		
		//region input of rental days: luxury villa
		for(int a=0;a<noOfLux;a++){
			totalNoSeasonRentalDay = 0;
			for(int b=0;b<noRentProperty;b++){
				int n = b+1;
				int RentalDays = 0;
				while(true){
					input = JOptionPane.showInputDialog(n + ". " + "Insert number of rental dayss for Luxury Villa with Registration Number " + luxury_villa.get(a).getRegNo());
					try{
						RentalDays = Integer.parseInt(input);
						break;
					}catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
					}
				}
				luxury_villa.get(a).RentProperty(RentalDays);	
			}
		}
	}
}
