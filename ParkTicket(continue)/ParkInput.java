package ParkTicket;

import java.util.Scanner;

public class ParkInput {
		private Scanner sc = null;
		public ParkOutput outclass = null;
				
		public ParkInput() {
			sc = new Scanner(System.in);
			outclass = new ParkOutput();
		}
		
		public int inputFromConsoleTicket() {
		int Ticketmenu;
		System.out.printf("권종을 선택하세요.\n");
		System.out.printf("1. 주간권\n");
		System.out.printf("2. 야간권\n");
		while (true) {
		Ticketmenu = sc.nextInt();
		if (Ticketmenu == 1 || Ticketmenu == 2) {
		return Ticketmenu;
		} else {
				outclass.printError();
		}
		}
		}
		

	public String Identification() {
			String identification;
			System.out.printf("주민번호 앞7자리를 입력하세요.(숫자만)\n");
			while (true) {
				identification = sc.next();
				if (identification.length() == ParkConstvalue.MAX_ID_DIGITS) {
				return identification;
				} else {
					outclass.printError();
				}
			}
			
			
		}
	
	public int inputOrdercount() {
		int Ordercount;
		System.out.printf("몇개를 주문하시겠습니까? (최대 10개)\n");
		while (true) {
			Ordercount = sc.nextInt();
			if (Ordercount <= ParkConstvalue.MAX_COUNT && Ordercount >= ParkConstvalue.MIN_COUNT) {
			return Ordercount;
			} else {
				outclass.printError();
			}
		}
		
		
	}
		
		public int inputPretreat() {
			int Pretreat;
			System.out.printf("우대사항을 선택하세요.\n");
			System.out.printf("1. 없음(나이 우대는 자동처리)\n");
			System.out.printf("2. 장애인\n");
			System.out.printf("3. 국가유공자\n");
			System.out.printf("4. 다자녀\n");
			System.out.printf("5. 임산부\n");
			while (true) {
				Pretreat = sc.nextInt();
				if (Pretreat >= 1 && Pretreat <= 5) {
				return Pretreat;
				} else {
					outclass.printError();
				}
			}
			
		}
		
		public int Ticket_Continue() {
			int reorder;
			System.out.printf("계속 발권 하시겠습니까?\n");
			System.out.printf("1. 티켓 발권\n");
			System.out.printf("2. 종료\n");
			reorder = sc.nextInt();
			return reorder;
		}
		
		public int continueorexit() {
			int continueexit;
			System.out.printf("계속 진행(1: 새로운 주문, 2: 프로그램 종료) : ");
			continueexit = sc.nextInt();
			return continueexit;
			
		}



}
