
public class Fish extends Animal {

	public Fish(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		// TODO Auto-generated constructor stub
	}

	public void swim() {
		System.out.println("swimming.....");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
		System.out.println("fish is swimming.....");
		
	}
	
}
