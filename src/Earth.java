
public class Earth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human tom = new Human();
		tom.age = 25;
		tom.eyeColor = "Brown";
		tom.heightInInches = 72;
		tom.name = "Tom";
		
		Human joe = new Human();
		joe.age = 27;
		joe.eyeColor = "Black";
		joe.heightInInches = 65;
		joe.name = "Joe";
		
		
		tom.speak();
		System.out.println();
		joe.speak();

	}

}
