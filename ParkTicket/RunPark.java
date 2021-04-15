package ParkTicket;

import java.io.IOException;

public class RunPark {
	
	public int Total_Price_No_Discount(int option, int identification, int count, int priority) throws IOException {
		int price;
		String type_of_person;
		if(option == 1) {
			if( identification >= ParkConstvalue.Age_Standard[3]) {
				price = ParkConstvalue.DP[3] * count;
				type_of_person = ParkConstvalue.PersonType[3];
				
			}else if( identification > ParkConstvalue.Age_Standard[1] && identification <= ParkConstvalue.Age_Standard[0]) {
				price = ParkConstvalue.DP[0] * count;
				type_of_person = ParkConstvalue.PersonType[0];
				
			}else if( identification > ParkConstvalue.Age_Standard[2] && identification <= ParkConstvalue.Age_Standard[1]) {
				price = ParkConstvalue.DP[1] * count;
				type_of_person = ParkConstvalue.PersonType[1];
				
			}else if( identification > ParkConstvalue.Age_Standard[4] && identification <= ParkConstvalue.Age_Standard[2]) {
				price = ParkConstvalue.DP[2] * count;
				type_of_person = ParkConstvalue.PersonType[2];
				
			}else {
				price = ParkConstvalue.DP[4] * count;
				type_of_person = ParkConstvalue.PersonType[4];
				
			}
		}else {
			if( identification >= ParkConstvalue.Age_Standard[3]) {
				price = ParkConstvalue.NP[3] * count;
				type_of_person = ParkConstvalue.PersonType[3];
				
			}else if( identification > ParkConstvalue.Age_Standard[1] && identification <= ParkConstvalue.Age_Standard[0]) {
				price = ParkConstvalue.NP[0] * count;
				type_of_person = ParkConstvalue.PersonType[0];
				
			}else if( identification > ParkConstvalue.Age_Standard[2] && identification <= ParkConstvalue.Age_Standard[1]) {
				price = ParkConstvalue.NP[1] * count;
				type_of_person = ParkConstvalue.PersonType[1];
			}else if( identification > ParkConstvalue.Age_Standard[4] && identification <= ParkConstvalue.Age_Standard[2]) {
				price = ParkConstvalue.NP[2] * count;
				type_of_person = ParkConstvalue.PersonType[2];
				
			}else {
				price = ParkConstvalue.NP[4] * count;
				type_of_person = ParkConstvalue.PersonType[4];
				
			}
		}
		ParkConstvalue.Total_Price = ParkConstvalue.Total_Price + Total_Price_Discount(price, priority);
		ParkConstvalue.OneLine_Ticket.add(ParkConstvalue.TicketType[option-1] + " " + type_of_person + " x " + count + "   " + Total_Price_Discount(price, priority) + "¿ø  *" + ParkConstvalue.Priority[priority-1]);
		return Total_Price_Discount(price, priority);
	}
	
	public static int Total_Price_Discount(int price, int priority) {
		int Sum_Price = (int) (price * ParkConstvalue.Discount[priority-1]);
		return Sum_Price;
	}
}
	
	

