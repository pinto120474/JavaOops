
public class Sparrow extends Bird implements Flyable{

	public Sparrow(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		// TODO Auto-generated constructor stub
	}
	
	
	public void fly() {
		System.out.println("Sparrow flying high....");
	}
	
	public void move( ) {
		System.out.println("Flapping wings....");
	}
}
