
public class Afifon extends Fly implements IFly {
	
	private String color;
	private double price;
//	private boolean island;
//	private int velocity;
	
	public Afifon(boolean island, int velocity, String color, double price) {
		super(island, velocity);
		this.color = color;
		this.price = (price > 0)? price:0;
	}
	
	
	@Override
	public void fly (int velocity) {
		System.out.println("Now the afifon fly at velocity ==> " + velocity);
		
	}


	@Override
	public boolean land() {
		System.out.println("function afifon land");
		return getIsland();
	}

}
