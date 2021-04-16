package ParkTicket;

import java.util.Scanner;

public class ParkInput {
		private Scanner sc = null;
				
		public ParkInput() {
			sc = new Scanner(System.in);
		}
		
		public int inputFromConsoleTicket() {
		int Ticketmenu;
		System.out.printf("권종을 선택하세요.\n");
		System.out.printf("1. 주간권\n");
		System.out.printf("2. 야간권\n");
		Ticketmenu = sc.nextInt();
		return Ticketmenu;
		}
		

	public int inputCustomerIDnumber() {
			int CustomerIDnumber;
			System.out.printf("주민번호를 입력하세요.\n");
			CustomerIDnumber = sc.nextInt();
			return CustomerIDnumber;
		}
	
	public int inputOrdercount() {
		int Ordercount;
		System.out.printf("몇개를 주문하시겠습니까? (최대 10개)\n");
		Ordercount = sc.nextInt();
		return Ordercount;
		
	}
		
		public int inputPretreat() {
			int Pretreat;
			System.out.printf("우대사항을 선택하세요.\n");
			System.out.printf("1. 없음(나이 우대는 자동처리)\n");
			System.out.printf("2. 장애인\n");
			System.out.printf("3. 국가유공자\n");
			System.out.printf("4. 다자녀\n");
			System.out.printf("5. 임산부\n");
			Pretreat = sc.nextInt();
			return Pretreat;
		}
		
		public int Whether() {
			int whether;
			System.out.printf("계속 발권 하시겠습니까?\n");
			System.out.printf("1. 티켓 발권\n");
			System.out.printf("2. 종료\n");
			whether = sc.nextInt();
			return 0;
			
		}



}
