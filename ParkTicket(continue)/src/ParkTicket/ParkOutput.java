package ParkTicket;

import java.util.Scanner;

public class ParkOutput {
	public RunPark run = null;
	private Scanner sc = null;
	public ParkOutput() {
		run = new RunPark();
		sc = new Scanner(System.in);
	}

	public void Print_Price(int Total_Price) {
		System.out.println("가격은 " + Total_Price + " 원입니다.\n감사합니다.\n");
	}
	
	public void printError() {
		System.out.println("다시 입력해주세요.");
	}
	
	public String printAgesort(int age) {
		String type = "";
		if (age >= 65) {
			type = ParkConstvalue.Sort_Old; 
		} else if (age <= ParkConstvalue.MAX_ADULT && age >= ParkConstvalue.MIN_ADULT) {
			type = ParkConstvalue.Sort_Adult; 
		} else if (age <= ParkConstvalue.MAX_TEEN && age >= ParkConstvalue.MIN_TEEN) {
			type = ParkConstvalue.Sort_Teen; 
		} else if (age <= ParkConstvalue.MAX_CHILD && age >= ParkConstvalue.MIN_CHILD) {
			type = ParkConstvalue.Sort_Child; 
		} else {
			type = ParkConstvalue.Sort_Baby + "(유아는 무료)"; 
		}
		return type;
	}
	
	public void Startfreceipt() {
		System.out.println("================== 폴리랜드 ==================");
	}
	
	public String receipt(int type, String ageType, int numTicket, int price, int priortype) {
		String ticketType = "";
		if (type == 1) {
			ticketType = "주간권";
		} else if (type == 2) {
			ticketType = "야간권";
		}
		
		String prior = "";
		if (priortype == ParkConstvalue.Type_NoPriority) {
			prior = "우대적용 없음";
		} else if (priortype == ParkConstvalue.Type_Disabled) {
			prior = "장애인 우대적용";
		} else if (priortype == ParkConstvalue.Type_NatMerit) {
			prior = "국가유공자 우대적용";
		} else if (priortype == ParkConstvalue.Type_MultiKid) {
			prior = "다자녀 우대적용";
		} else if (priortype == ParkConstvalue.Type_Pregnant) {
			prior = "임산부 우대적용";
		}
		
		String deal = String.format("%s %s X %d %d원 *%s\n", 
				ticketType, ageType, numTicket, price, prior);
		
		return deal;
		}
		
		public void ReceiptTotal(int totalenterPrice) {
			System.out.println();
			System.out.printf("입장료 총액은 " + totalenterPrice + " 원 입니다\n");
	}
	
		public void Endreceipt() {
			System.out.println("==============================================\n");
	}
		
	


	

}
