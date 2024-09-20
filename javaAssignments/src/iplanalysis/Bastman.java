package iplanalysis;

public class Bastman {
	//Attributes of class
	//objects should be private 
	
	private String name;
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int fours;
	private int sixes;
	
	//static :it has a unique value generation in id, no of objects but id will be unique.
	private int id;
	private static int idGenerator =0;
	//constructors
	public Bastman() {
		this.id=++idGenerator;
	//defalut constructor	
	}
	//parameteried constructor 
	public Bastman(String name,int runs,int centuries,int halfCenturies,int ballsFaced,int fours,int sixes) {
	this.id=++idGenerator;
	this.name=name;
	this.runsScored=runs;
	this.setCenturies(centuries);
	this.halfCenturies=halfCenturies;
	this.ballsFaced=ballsFaced;
	this.fours=fours;
	this.sixes=sixes;
	}
	//getter and setter methods in a class
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	public int getHalfCenturies() {
		return halfCenturies;
	}
	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}
	public int getBallsFaced() {
		return ballsFaced;
	}
	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}
	public int getFours() {
		return fours;
	}
	public void setFours(int fours) {
		this.fours = fours;
	}
	public int getSixes() {
		return sixes;
	}
	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	public int getCenturies() {
		return centuries;
	}
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	//
	float getStrikeRate() {
		return (this.runsScored/this.ballsFaced)*100;
	}
	int getRunsScoredInBoundaries() {
		return (this.fours*4)+(this.sixes*6);
	}
	class Espncricinfo {
		private static final int size=50;
		private Bastman[] batsmans=new Bastman[size];
		private int noOfBatsmen;

		public Bastman[] getBastmans() {
			return batsmans;
		}
		public int getNoOfBatsmen() {
			return noOfBatsmen;
		}
		public int addBatsman(String name,int runsScored,int centuries,int halfCenturies,int ballsFaced,int fours,int sixes) {
			if(noOfBatsmen<size-1) {
				Bastman bastman =new Bastman(name, runsScored, centuries,halfCenturies,ballsFaced,fours,sixes);
				batsmans[noOfBatsmen]=bastman;
				noOfBatsmen++;
				return bastman.getId();
			}
			return 0;
		}
	}

	
//	public Bastman updateBastmanStats(int id,int runsScored, int fours,int sixes,int ballsFaced) {
//		for(int i=0;i< noOfBastmen;i++) {
//			if(id == bastman[i].getId()) {
//				bastman[i].setRunsScored(bastman[i].getRunsScored+ runsScored);
//			}
//		}
//	}

}


