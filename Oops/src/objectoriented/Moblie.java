package objectoriented;

public class Moblie {
	String model;
	String RAM;
	String Processor;
	String typeOfColor;
	String SimSlot;
	//calling a default constructor
	public Moblie() {
		
	}
	//calling a parameteried COnstructor
	public Moblie(String m,String r,String p,String c,String S) {
		model=m;
		RAM=r;
		Processor=p;
		typeOfColor=c;
		SimSlot=S;
	}
	public void showMoblie() {
		System.out.println(" show the mobile");
	}
	public String toString() {
		return "mobile name: "+model+"\n RAM :"+RAM+"\n processor of moblie:"+Processor+"\n Color : "+typeOfColor+"\n Type of simslots:"+SimSlot;
	}
	public static void main(String[] args) {
		Moblie iphone=new Moblie("Iphone 11proMax","8Gb","ios","Gold","esim");
		System.out.println(iphone.toString());
		iphone.showMoblie();
		System.out.println("================================");
		
		Moblie googlepixel=new Moblie("Googlepixel7Pro","6GB","Snapdragon","Sliver","physicalsim");
		System.out.println(googlepixel.toString());

		googlepixel.showMoblie();
		
		System.out.println("===========================");
		Moblie samsung=new Moblie("Samsung Tab","8Gb","qualcomsnapdragon","black","physicalsim");
		System.out.println(samsung.toString());
		samsung.showMoblie();
		//System.out.println(samsung);
		System.out.println("=================================");
		Moblie realme=new Moblie("Realme","12gb","oxygenos","red","physicalsim");
		System.out.println(realme.toString());

		
		realme.showMoblie();
		//System.out.println(realme);
	}
}