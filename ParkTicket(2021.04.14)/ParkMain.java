package ParkTicket;

public class ParkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Ticketmenu = 0;
		int CustomerIDnumber = 0;
		int Ordercount = 0;
		int Pretreat = 0;
		int whether = 0;
		ParkInput parkinput = new ParkInput();
		do {
			Ticketmenu = parkinput.inputFromConsoleTicket();
			CustomerIDnumber = parkinput.inputCustomerIDnumber();
			Ordercount = parkinput.inputOrdercount();
			Pretreat = parkinput.inputPretreat();
			whether = parkinput.Whether();
		} while (Ticketmenu != 0);

	}

}
