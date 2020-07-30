
public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		Bird bird1 = new Bird(3,"F", 5);		
		
		@SuppressWarnings("unused")
		Fish fish1 = new Fish(2, "M", 3);
		fish1.move();
		
		Sparrow sp = new Sparrow(0, null, 0);
		sp.move();
	}
}
