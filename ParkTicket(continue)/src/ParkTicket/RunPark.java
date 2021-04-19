package ParkTicket;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RunPark {
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	
	public int ageCal(String identification) {
		int birthYear = Integer.parseInt(identification.substring(0, 2));
		int current = Integer.parseInt(sdf.format(cal.getTime()).substring(0, 4));
		int centuryDiv = Integer.parseInt(identification.substring(6, 7));
		int age = 0;
		
		if (centuryDiv == 1 || centuryDiv == 2) {
			age = current - (birthYear + 1900) + 1;
		} else if (centuryDiv == 3 || centuryDiv == 4){
			age = current - (birthYear + 2000) + 1; 
		}
		return age;
	}
	
	public int PriceCal(int ticketType, int age) throws IOException {
		int ageType = Agesort(age);
		int price = 0;
		switch (ticketType) {
			case 1:
				if (ageType == ParkConstvalue.Type_Old) {
					price = ParkConstvalue.DPOld;
				} else if (ageType == ParkConstvalue.Type_Adult) {
					price = ParkConstvalue.DPAdult;
				} else if (ageType == ParkConstvalue.Type_Teen) {
					price = ParkConstvalue.DPTeen;
				} else if (ageType == ParkConstvalue.Type_Child) {
					price = ParkConstvalue.DPChild;
				} else if (ageType == ParkConstvalue.Type_Baby){
					price = 0;
				} break;
			case 2:
				if (ageType == ParkConstvalue.Type_Old) {
					price = ParkConstvalue.NPOld;
				} else if (ageType == ParkConstvalue.Type_Adult) {
					price = ParkConstvalue.NPAdult;
				} else if (ageType == ParkConstvalue.Type_Teen) {
					price = ParkConstvalue.NPTeen;
				} else if (ageType == ParkConstvalue.Type_Child) {
					price = ParkConstvalue.NPChild;
				} else if (ageType == ParkConstvalue.Type_Baby){
					price = 0;
				} break;
		}
		return price;
	}
	
	public int priorCal(int price, int option) {
		int discount = price;
		switch (option) {
			case 1: break;
			case 2: discount = (int)((price * ParkConstvalue.priorDisabled)) / 10 * 10; break;
			case 3: discount = (int)((price * ParkConstvalue.priorNatMerit)) / 10 * 10; break;
			case 4: discount = (int)((price * ParkConstvalue.priorMultiKid)) / 10 * 10; break;
			case 5: discount = (int)((price * ParkConstvalue.priorPregnant)) / 10 * 10; break;
		}
		return discount;
	}
	
	public int Agesort(int age) {
		if (age < ParkConstvalue.MIN_CHILD) {
			return ParkConstvalue.Type_Baby;
		} else if ((age >= ParkConstvalue.MIN_CHILD) && (age <= ParkConstvalue.MAX_CHILD)) {
			return ParkConstvalue.Type_Child;
		} else if ((age >= ParkConstvalue.MIN_TEEN) && (age <= ParkConstvalue.MAX_TEEN)) {
			return ParkConstvalue.Type_Teen;
		} else if ((age >= ParkConstvalue.MIN_ADULT) && (age <= ParkConstvalue.MAX_ADULT)) {
			return ParkConstvalue.Type_Adult;
		} else if (age > ParkConstvalue.MAX_ADULT) {
			return ParkConstvalue.Type_Old;
		} else {
			return 0;
		}
	}
	
}
	
	

