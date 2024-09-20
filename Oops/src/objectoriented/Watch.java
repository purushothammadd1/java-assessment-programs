package objectoriented;

public class Watch {
	//properties of an watch (objects)
	String type;
	String color;
	String typeofDial;
	String typeOfStrap;
	public Watch() {
		
	}
	public Watch(String t,String c,String tod,String tos) {
		type=t;
		color=c;
		typeofDial=tod;
		typeOfStrap=tos;
	}
	//behaviour means show time (methods)
	
	public void showTime() {
		System.out.println("show the time:");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch gShock=new Watch("Analog","Black","Oval","Metallic");
		
		System.out.println("Type of Watch:"+gShock.type);
		System.out.println("color of watch:"+gShock.color);
		System.out.println("Type of Dial:"+gShock.typeofDial);
		System.out.println("Type of Strap:"+gShock.typeOfStrap);
		gShock.showTime();
		System.out.println(gShock);
		

	}

}
