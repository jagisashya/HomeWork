
public class Passenger {
	private int flyPrice;
	private int permitedWeight;
	private SuitCase suitCase;
	private int priceOverKilo;
	
	public Passenger () {}
	
	public Passenger(int flyPrice, int permitedWeight, SuitCase suitCase, int priceOverKilo) {
		this.flyPrice = flyPrice;
		this.permitedWeight = permitedWeight;
		this.suitCase = suitCase;
		this.priceOverKilo = priceOverKilo;
	}
	
	public int getFlyPrice() {
		return flyPrice;
	}
	
	public void setFlyPrice(int flyPrice) {
		this.flyPrice = flyPrice;
	}
	
	public int getPermitedWeight() {
		return permitedWeight;
	}
	
	public void setPermitedWeight(int permitedWeight) {
		this.permitedWeight = permitedWeight;
	}
	
	public SuitCase getSuitCase() {
		return suitCase;
	}
	
	public void setSuitCase(SuitCase suitCase) {
		this.suitCase = suitCase;
	}
	
	public int getPriceOverKilo() {
		return priceOverKilo;
	}
	
	public void setPriceOverKilo(int priceOverKilo) {
		this.priceOverKilo = priceOverKilo;
	}
	
	public String overWeight () {
		if (this.suitCase.getSuitCaseWeight() > this.getPermitedWeight()) {
			return	toString() +
//				   "You have permision to       ==> " + this.getPermitedWeight() + " kg \n" +
// 				   "And your suitcase weight is ==> " + this.suitCase.getSuitCaseWeight() + " kg \n" +
				   "Your over weight is         ==> " + (this.suitCase.getSuitCaseWeight() - this.getPermitedWeight()) +
				   "\n\nYour case is over weight \n" ;
		}
		return "0";
	}
	
	public int toPay() {
		return (this.suitCase.getSuitCaseWeight() - this.getPermitedWeight()) * this.getPriceOverKilo();
	}
	
	public void addWeight (int cash) {
		setPermitedWeight(getPermitedWeight() + cash / getPriceOverKilo());
	}
	
	@Override
	public String toString () {
		String str = suitCase.toString();
		return str += "\n\n" +
					  "You have                    ==> " + this.suitCase.getListProduct().size() + '\n' + 
				      "You have permision to       ==> " + this.getPermitedWeight() + " kg \n" +
				      "And your suitcase weight is ==> " + this.suitCase.getSuitCaseWeight() + " kg \n";
	}
	
	
}
