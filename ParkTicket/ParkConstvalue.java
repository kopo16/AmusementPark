package ParkTicket;

import java.util.ArrayList;

public class ParkConstvalue {
	public static int[] DP = {56000, 47000, 44000, 44000, 0};
	public static int[] NP = {46000, 40000, 37000, 37000, 0};
	public static final int[] Age_Standard = {64, 18, 12, 65, 2};
	public static final String[] PersonType = { "대인", "청소년", "소인", "경로", "유아"};
	public static final String[] TicketType = { "주간권", "야간권"};
	public static final String[] Priority = { "우대 없음", "장애인 우대적용", "국가유공자 우대적용", "다자녀 우대적용", "임산부 우대적용"};
	public static final double[] Discount = {1, 0.6, 0.5, 0.8, 0.85};
	public static int Total_Price = 0;
	public static int Daycount = 0;
	public static int Nightcount = 0;
	public static int[] DaycountType = {0, 0, 0, 0, 0};
	public static int[] NightcountType = {0, 0, 0, 0, 0};
	public static int[] Prioritycount = {0, 0, 0, 0, 0};
	public static int Day_Total_Price = 0;
	public static int Night_Total_Price = 0;
	public static int Day_Total_Count = 0;
	public static int Night_Total_Count = 0;
	public static ArrayList<String> OneLine_Ticket = new ArrayList<String>();
	
	

}
