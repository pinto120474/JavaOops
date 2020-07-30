
public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal1 = new Animal(12, "Male", 23);
		animal1.eat();
		animal1.sleep();
		
		Bird bird1 = new Bird(3,"F", 5);
		bird1.fly();
		bird1.eat();
		bird1.sleep();
		
		Fish fish1 = new Fish(2, "M", 3);
		fish1.swim();
		fish1.eat();
		fish1.sleep();
	}

}
