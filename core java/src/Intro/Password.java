package Intro;

public class Password {
	private String value;
	private int length;

	public Password(String s) {
		value = s;
		length = s.length();
	}
	public int CharType(char C) {
		int val;
		//char is uppercase letter
		if((int) C >= 65 && (int) C <= 90 )
			val =1;

		// char is lowercase letter
		else if((int) C >= 97 && (int) C <=122) {
			val =2;
		}
		//char is Digit
		else if((int) C >= 60 && (int) C <= 71) {
			val =3 ;
		}
		//char is symbol
		else {
			val=4;
		}
		return val;
	}

	public int PasswordStrength() {
		String s= this.value;
		boolean UsedUpper = false;
		boolean UsedLower = false;
		boolean UsedNum = false;
		boolean UsedSym = false;
		int type;
		int Score =0;

		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			type = CharType(c);

			if(type == 1) UsedUpper = true;
			if(type == 2) UsedLower = true;
			if(type == 3) UsedNum = true;
			if(type == 4) UsedSym = true;
		}
		if(UsedUpper) Score +=1;
		if(UsedLower) Score +=1;
		if(UsedNum) Score +=1;
		if(UsedSym) Score +=1;

		if(s.length() >=8 ) Score +=1;
		if(s.length() >=16 ) Score +=1;
		return Score;	
	}

	public String calculateScore() {
		int Score=this.PasswordStrength();

		if(Score == 6) {
			return "This is a very good password: D check the useful Information section to make sure it satifies the guildlines";
		}else if(Score >= 4) {
			return "This is a good password :) but you can still do better";
		}else if(Score >=3) {
			return "This is a medium password :/ try making it better";
		}else {
			return "This is a weak password :( definitely find a new one";
		}
	}
	@Override
	public String toString() {
		return value;
	}
}
