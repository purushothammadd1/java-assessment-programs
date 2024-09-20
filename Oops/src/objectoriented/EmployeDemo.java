package objectoriented;

public class EmployeDemo {

	
		
		 public static void main(String[] args) {
				// the order is employee id,name, last name,salary,hike
				Employe emp1 = new Employe(121, "purushotham","maddi", 40000, 50);
				System.out.println(emp1);
				System.out.println("==========================================");
				Employe emp2 = new Employe(122, "Raghu", "A", 50000, 45);
				System.out.println(emp2);

				System.out.println("==========================================");
				Employe emp3 = new Employe(123, "kalyan", "G", 80000, 75);
				System.out.println(emp3);

				System.out.println("=============================================");

				if ((emp1.getsalary() > emp2.getsalary()) && (emp1.getsalary() > emp3.getsalary())) {
					System.out.println(emp1.getFristName() + " more salary");
				} else if ((emp2.getsalary() > emp1.getsalary()) && (emp2.getsalary() > emp3.getsalary())) {
					System.out.println(emp2.getFristName() + " more salary");
				}
				else {
					System.out.println(emp3.getFristName() + " more salary");

				}

			}

		

	}


