package iplanalysis;

public class Bastman_Test {
public static void main(String[] args) {
	Bastman bat1=new Bastman();
	bat1.setName("virat kohli");
	bat1.setRunsScored(987);
	bat1.setBallsFaced(3);
	bat1.setHalfCenturies(10);
	bat1.setCenturies(20);
	bat1.setFours(42);
	bat1.setSixes(54);
	System.out.println("Id: "+bat1.getId());
	System.out.println("Name: "+bat1.getName());
	System.out.println("RunScored: "+bat1.getRunsScored());
	System.out.println("BallsFaced: "+bat1.getBallsFaced());
	System.out.println("HalfCenturies: "+bat1.getHalfCenturies());
	System.out.println("Centuries: "+bat1.getCenturies());
	System.out.println("No of Fours: "+bat1.getFours());
	System.out.println("No of sixes: "+bat1.getSixes());
	System.out.println("STrike: "+bat1.getStrikeRate());
	
	Bastman bat2=new Bastman("Dhoni",687,1,6,407,57,37);
	System.out.println("Id: "+bat2.getId());
	System.out.println("Name: "+bat2.getName());
	System.out.println("RunScored: "+bat2.getRunsScored());
	System.out.println("BallsFaced: "+bat2.getBallsFaced());
	System.out.println("HalfCenturies: "+bat2.getHalfCenturies());
	System.out.println("Centuries: "+bat2.getCenturies());
	System.out.println("No of Fours: "+bat2.getFours());
	System.out.println("No of sixes: "+bat2.getSixes());
	System.out.println("STrike: "+bat2.getStrikeRate());
	
	Bastman bat3=new Bastman("Dhoni",687,1,6,407,57,37);
	System.out.println(bat3.getId());
	System.out.println("STrike: "+bat3.getStrikeRate());
}
}
