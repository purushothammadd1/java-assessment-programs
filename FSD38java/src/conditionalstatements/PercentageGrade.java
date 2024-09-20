package conditionalstatements;
import java.util.*;
public class PercentageGrade{
	public static float total;
	public static float percent;

	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter percentage marks:");
		
		System.out.println("Enter the sub1 marks:");
		float sub1=sc.nextFloat();
		System.out.println("Enter the sub2 marks:");
		float sub2=sc.nextFloat();
		System.out.println("Enter the sub3 marks:");
		float sub3=sc.nextFloat();
		
		totalAvgPercent(sub1, sub2, sub3);
		 
		
		
	}

	public static void totalAvgPercent(float sub1,float sub2,float sub3) {
		// TODO Auto-generated method stub
		total=sub1+sub2+sub3;
		String s="";
		System.out.println("Total marks secured:"+ total);
		s+="Total marks secured: "+ total+"\n";
		percent=(total/300)*100;
		System.out.println("percentage of Student:"+percent);
		s+="percentage of Student: "+percent+"\n";
		if(percent >=90) {
			System.out.println("Grade A");
			s+="Grade A";
		}
		else if(percent >=70 && percent <90){
			System.out.println("Grade B");
			s+="Grade B";
		}
		else if(percent >=50 && percent<70) {
			System.out.println("Grade C");
			s+="Grade C";
		}
		else if(percent <50 && percent >=35) {
			System.out.println("Grade D");
			s+="Grade D";
		}
		else {
			System.out.println("Failed!");
			s+="Failed";
		}
		
	}
}