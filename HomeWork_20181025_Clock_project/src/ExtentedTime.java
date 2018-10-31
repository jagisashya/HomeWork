
public class ExtentedTime extends SimpleTime {
	private boolean is24Hours;

	public ExtentedTime() {
		super();
		this.is24Hours = true;
	}

	public ExtentedTime(int hour, int minute, int second, boolean is24Hours) {
		super(hour, minute, second);
		this.is24Hours = is24Hours;
	}
	
	public boolean isIs24Hours() {
		return is24Hours;
	}

	public void setIs24Hours(boolean is24Hours) {
		this.is24Hours = is24Hours;
	}

	@Override
	public String toString () {
		return String.format("the time is ==> %1$02d:%2$02d:%3$02d", 
				(this.is24Hours)?getHour():(getHour() >= 12)?getHour()-12:getHour()
					,getMinute(),getSecond());
	}

}
