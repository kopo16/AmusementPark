package ParkTicket;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWrite {
	
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd, HH:mm:ss");
	
	public void Statcells (String ticketType, String ageType, int Ordercount, int Total_Price) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\SKJ\\Desktop\\Statcells.csv");
		String data = String.format("%s,%s,%d,%d", ticketType, ageType, Ordercount, Total_Price);
		fw.write(data);
		fw.close();
		
	}

}
