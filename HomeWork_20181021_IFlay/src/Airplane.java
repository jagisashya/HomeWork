
public class Airplane extends Fly implements IFly {

	private String pilotName;
	private String companyName;
	private String destination;
//	private boolean island;
//	private int velocity;	
	
		
	public Airplane(boolean island, int velocity, String pilotName, String companyName, String destination) {
	super(island, velocity);
	this.pilotName = pilotName;
	this.companyName = companyName;
	this.destination = destination;
	}


	@Override
	public void fly(int velocity) {
		System.out.println("function airplane velocity");
		System.out.println("Now we fly at velocity ==> " + velocity);
	}

	@Override
	public boolean land() {
		System.out.println("estamos no land do airplane");
		return getIsland();
	}

}
