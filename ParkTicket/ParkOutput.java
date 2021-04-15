package ParkTicket;

import java.util.Scanner;

public class ParkOutput {
	Scanner sc = new Scanner(System.in);
	RunPark rp = new RunPark();
	ParkMain main = new ParkMain();
	
	public void Print_Result() {
		System.out.println("티켓 발권을 종료합니다. 감사합니다.\n\n");
		System.out.println("=================폴리랜드=================");
		for (int i = 0; i < ParkConstvalue.OneLine_Ticket.size(); i++) {
				System.out.println(ParkConstvalue.OneLine_Ticket.get(i));
		}
		System.out.println("\n입장료 총액은 " + ParkConstvalue.Total_Price + "원입니다.");
		System.out.println("======================================");
	}
	
	public void Print_Price(int Total_Price) {
		System.out.println("가격은 " + Total_Price + " 원입니다.\n감사합니다.\n");
	}


	

}
