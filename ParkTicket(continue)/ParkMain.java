package ParkTicket;

import java.io.IOException;

public class ParkMain {
	
	public static int type, Ordercount, priortype, age , agesort, price, realprice;
	public static int reorder, totalprice, continueexit;
	public static String identification, ageSort, deal;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ParkInput parkinput = new ParkInput();
		RunPark run = new RunPark();
		ParkOutput outclass = new ParkOutput();
		while (true) {
			type = parkinput.inputFromConsoleTicket();
			identification = parkinput.Identification();
			Ordercount = parkinput.inputOrdercount();
			priortype = parkinput.inputPretreat();
			age = run.ageCal(identification);
			agesort = run.Agesort(age);
			price = run.PriceCal(type, age);
			realprice = run.priorCal(price, priortype);
			realprice = Ordercount * realprice;
			ageSort = outclass.printAgesort(age);
			outclass.Print_Price(realprice);
			totalprice += realprice;
			deal += outclass.receipt(type, ageSort, Ordercount, realprice, priortype);
			
			reorder = parkinput.Ticket_Continue();
			
			if (reorder == 2) {
				outclass.Startfreceipt();
				System.out.println(deal);
				outclass.ReceiptTotal(totalprice);
				outclass.Endreceipt();
				continueexit = parkinput.continueorexit();
				deal = "";
				totalprice = 0;
				}
				
			}
		} 

	}


