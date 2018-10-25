
public  class Fly {
	private boolean island;
	private int velocity;

	public Fly(boolean island, int velocity) {
		super();
		this.island = island;
		this.velocity = (velocity>0)?velocity:0;
	}

	public boolean getIsland() {
		return island;
	}

	public void setIsland(boolean island) {
		this.island = island;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	} 
}
