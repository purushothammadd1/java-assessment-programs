//package bankapp;
//
//import java.util.Scanner;
//
//public class BankApp_Test {
//
//
//
//
//
//	public static void main(String[] args) {
//
//		Bank myBank=new Bank();
//		Scanner sc=new Scanner(System.in);
//		int menuChoice;
//		do {
//			System.out.println("--------------------------------------------------------");
//			System.out.println("                My Bank Application                     ");
//			System.out.println("--------------------------------------------------------");
//			System.out.println("Bank Menu:");
//			System.out.println("1.Add a customer");
//			System.out.println("2.Display all customers");
//			System.out.println("3.Display customer by ID");
//			System.out.println("4.Display number of customers");
//			System.out.println("5.credit (Deposit)");
//			System.out.println("6.debit (withdraw) ");
//			System.out.println("7.Amount Transfer(Account to account)");
//			System.out.println("8.Exit ");
//			System.out.println("-------------------------");
//			System.out.println("choose any options:");
//			System.out.println("-------------------------");
//			menuChoice = sc.nextInt();
//			sc.nextLine();
//			switch(menuChoice) {
//			case 1:
//				System.out.println("Enter First Name: ");
//				String fName =sc.nextLine();
//				System.out.println("Enter Last Name: ");
//				String lName=sc.nextLine();
//				System.out.println("Enter your address: ");
//				String add=sc.nextLine();
//				//read account number 
//				System.out.println("Enter account number: ");
//				String accNo=sc.nextLine();
//				//read account name
//				System.out.println("Enter account name:");
//				String accName =sc.nextLine();
//				//read type of customer
//				System.out.println("Enter your type of customer (p for personal,c for commerical): ");
//				char custType=sc.next().charAt(0);
//				sc.nextLine();
//				if(custType =='p') {
//					//read homephone and workphone and continue
//					System.out.println("Enter your homephone:");
//					String homeph=sc.nextLine();
//					System.out.println("Enter your workphone: ");
//					String workph=sc.nextLine();
////				}
////				else {
////					//read contactperson name and contact phone 
//				//create a Account object
//				Account depAcc =new Account(accNo,accName);
//				//create a customer object
//				Customer aCustomer =new PersonalCustomer(fName , lName, add,depAcc,homeph,workph);
//				//Add that customer object to myBank object
//				myBank.addCustomer(aCustomer);
//				//print succes the message
//				System.out.println("This customer is sucessfully added to my bank.");//working
//				}
//				break;
//			case 2:
//
//				Customer[] custs=myBank.getCustomers();
//				for(int i=0;i < Bank.getCustCount();i++) {
//					System.out.println(custs[i]);
//				}
//
//				break;
//			case 3:
//				System.out.println("Enter a customer Id:");
//				long id=sc.nextLong();
//				System.out.println(myBank.getCustomerById(id));
//				break;
//			case 4:
//				System.out.println("Number of customers in the bank: "+Bank.getCustCount());
//				break;
//			case 5:
//				System.out.println("Enter your customer Id: ");
//				//read the value 
//				long custID=sc.nextLong();
//				System.out.println("Enter the amount to deposit:");
//				int amountd =sc.nextInt();
//				//get customer id
//				Customer c =myBank.getCustomerById(custID);
//				if(c != null) {
//				//get account of the customer
//				Account cr=c.getAccount();
//				//call credit on the account supplying the amount
//				cr.credit(amountd);
//				System.out.println("Sucessfully credited money in your account "+"\n"+cr);
//				}else
//				{
//					System.err.println("Error: Customer with Id "+custID+" is not found");
//				}
//				break;
//			case 6:
//				System.out.println("Enter your customerId: ");
//				//read the customer id
//				long custId=sc.nextLong();
//				System.out.println("Enter amount to withdraw");
//				int amountwd =sc.nextInt();
//				//get customer id
//				Customer dep=myBank.getCustomerById(custId);
//				//get account of the customer
//				Account wd=dep.getAccount();
//				//call debit on the account supplying the amount
//				wd.debit(amountwd);
//				System.out.println("Successfully withdraw money "+"\n"+wd);//working
//				break;
//			case 7:
//				System.out.println("Enter your customerId to whom you want to transfer the money :");
//				long custoId1=sc.nextLong();
//				long custoId2=sc.nextLong();
//				System.out.println("Enter amount to transfer");
//				int amounttd=sc.nextInt();
//				//get customer id
//				Customer cos1=myBank.getCustomerById(custoId1);
//				Customer cos2=myBank.getCustomerById(custoId2);
//				//get account of the customer
//				Account depost = cos1.getAccount();
//								depost.debit(amounttd);
//				Account cred = cos2.getAccount();
//				//				cred.credit(amountt);
//
//				depost.transferTo(cred, amounttd);
//				//call transfer the amount to another account
//				//id.transferTo(id, amounttd);
//				System.out.println("Sucessfully amount transfered "+"\n"+cred);//not working
//				break;
//			case 8:
//				System.out.println("Thank you for using our bank");
//				System.exit(0);
//			default:
//				System.out.println("Enter a value within 1 to 6");
//				break;
//			}
//
//		} while( menuChoice != 8 );
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////		// TODO Auto-generated method stub
//
////		//System.out.println(Bank.getCustCount());
////
////		Customer c1=new Customer();
////		myBank.addCustomer(c1);
////		Customer c2=new Customer("nagaraju","m","wrgl");
////		myBank.addCustomer(c2);
////		Customer c3=new Customer("harish","mekala","sypt");
////		myBank.addCustomer(c3);
////		Account c1=new Account();
////System.out.println(c1);
////System.out.println(c1.credit(1000));
////System.out.println(c1.getBalance());
//
//////			System.out.println(myBank.getCustCount());
////		System.out.println("customer Id 2:");
////		System.out.println(myBank.getCustomerById(2));
////		
//
