package ParkTicket;

import java.util.ArrayList;

public class ParkConstvalue {
	public static final int DPAdult = 56000;
	public static final int DPTeen = 47000;
	public static final int DPChild = 44000;
	public static final int DPOld = 44000;
	public static final int NPAdult = 46000;
	public static final int NPTeen = 40000;
	public static final int NPChild = 37000;
	public static final int NPOld = 37000;
	public static final int Type_NoPriority = 1; 
	public static final int Type_Disabled = 2; 
	public static final int Type_NatMerit = 3; 
	public static final int Type_MultiKid = 4; 
	public static final int Type_Pregnant = 5; 
	public static final double priorDisabled = 0.6;
	public static final double priorNatMerit = 0.5;
	public static final double priorMultiKid = 0.8;
	public static final double priorPregnant = 0.85;
	public static final int MIN_CHILD = 3;
	public static final int MIN_TEEN = 13;
	public static final int MIN_ADULT = 19;
	public static final int MAX_CHILD = 13;
	public static final int MAX_TEEN = 18;
	public static final int MAX_ADULT = 64;
	public static final int MAX_COUNT = 10;
	public static final int MIN_COUNT = 1;
	public static final int MAX_ID_DIGITS = 7;
	public static final int MIN_ID_DIGITS = 1;
	
	public static final String DAYPASS = "주간권"; 
	public static final String NIGHTPASS = "야간권";
	public static final String Sort_Baby = "유아";
	public static final String Sort_Child = "어린이";
	public static final String Sort_Teen = "청소년";
	public static final String Sort_Adult = "어른";
	public static final String Sort_Old = "노인";

	public static final String prior_NONE = "없음";
	public static final String prior_Disabled = "장애인";
	public static final String prior_NatMerit = "국가유공자";
	public static final String prior_MultiKid = "다자녀";
	public static final String prior_Pregnant = "임산부";
	
	public static final int Type_Baby = 1;
	public static final int Type_Child = 2;
	public static final int Type_Teen = 3;
	public static final int Type_Adult = 4;
	public static final int Type_Old = 5;
	
	public static final String savePATH1 = "C:\\Users\\SKJ\\Desktop\\Statcells.csv";
	public static final String savePATH2 = "C:\\Users\\SKJ\\Desktop\\Report.csv";

	public static ArrayList<CustomerInfo> csInfoArr = new ArrayList<CustomerInfo>();
}