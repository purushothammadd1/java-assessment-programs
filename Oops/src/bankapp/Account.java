package bankapp;

public class Account {
	private String accnumber="SBIJ00";
	private String name;
	private int balance=0;
	private static int account;

	public Account() {
		account++;
		this.accnumber=accnumber;
		String accnumber;
		String name;

	}
	
	public Account(String accnumber,String name) {
		this.accnumber=accnumber;
		this.name=name;

	}
	public Account(String id,String name,int balance) {
		this.accnumber=id;
		this.name=name;
		this.balance=balance;
	}

	//methods:getter and toString()
	public String getID() {
		return accnumber;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	
	
	public String getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(String accnumber) {
		this.accnumber = accnumber;
	}
	public static int getAccount() {
		return account;
	}
	public static void setAccount(int account) {
		Account.account = account;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int credit(int amount) {
		balance +=amount;
		return balance;
	}
	public int debit(int amount) {
		if(amount<=balance ) 
			balance -=amount;
		else {
			System.out.println("Insuccifient funds.amount exceeded balance:");
		}
		return balance;
	}
	public int transferTo(Account another,int amount) {

		this.debit(amount);
		another.credit(amount); {
			System.out.println("successfully transfer the money.");
		}	
		return balance;

	}
	
	public String toString() {
		return "Account[AccountNo="+accnumber+",AccountName="+name+",balance="+balance+"]";
	}
}
