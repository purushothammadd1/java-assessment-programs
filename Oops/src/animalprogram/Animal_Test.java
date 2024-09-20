package animalprogram;

public class Animal_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal anima=new Animal("Ghost");
//		System.out.println(anima);
		Mammal mycat =new Cat("kitty");
		Mammal mydog =new Dog("hulk");
		mycat.greets();
		mydog.greets();
		
		Dog myBigDog1=new BigDog("Rocky");
		BigDog myBigDog2=new BigDog("Singham");
		Mammal myBigDog3=new Mammal("Goldy");
		BigDog myBigDog4=new BigDog("Singham");
		myBigDog4.greets(myBigDog3);

	}

}
