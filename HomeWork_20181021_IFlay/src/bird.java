
public class bird extends Fly implements IFly {


	private String birdType;
	private int age;
	private String color;
	

	public bird(boolean island, int velocity, String birdType, int age, String color) {
		super(island, velocity);
		this.birdType = birdType;
		this.age = (age > 0)? age:0;
		this.color = color;
	}


	@Override
	public void fly(int velocity) {
		System.out.println("Now the bird fly at velocity ==> " + velocity);
		
	}

	@Override
	public boolean land() {
		System.out.println("function bird land");
		return getIsland();
	}

}
