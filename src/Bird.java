
public class Bird extends Animal{
	
	public Bird(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		// TODO Auto-generated constructor stub
	}

	public void fly() {
		System.out.println("flying....");
	}
	
	public void drink() {
		System.out.println("Drinking.....");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
		System.out.println("bird is flying....");
		
	}

}
