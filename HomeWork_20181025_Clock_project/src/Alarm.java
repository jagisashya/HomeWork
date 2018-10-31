
public class Alarm extends ExtentedTime {
//	private SimpleTime time;
	private boolean isSet;
	private int snoozeTime;
	private boolean isSnoze;

	public Alarm() {
		super();
		this.isSet = false;
		this.snoozeTime = 0;
		this.isSnoze = false;
	}

	public Alarm(int hour, int minute, int second, boolean is24Hours, boolean isSet, int snoozeTime, boolean isSnoze) {
		super(hour, minute, second, is24Hours);
		this.isSet = isSet;
		this.snoozeTime = snoozeTime;
		this.isSnoze = isSnoze;
	}

	public boolean isSet() {
		return isSet;
	}

	public void setSet(boolean isSet) {
		this.isSet = isSet;
	}

	public int getSnoozeTime() {
		return snoozeTime;
	}

	public void setSnoozeTime(int snoozeTime) {
		this.snoozeTime = snoozeTime;
	}

	public boolean isSnoze() {
		return isSnoze;
	}

	public void setSnoze(boolean isSnoze) {
		this.isSnoze = isSnoze;
	}

	public void timeToWakeUp(SimpleTime time) {
		if (this.isSet) {
			if (equals(time)) {
				System.out.println("Start beep beep beep");
				this.isSet = false;
			}
		} else {
			if (this.isSnoze) {
				super.addMinuts(snoozeTime);
				this.isSet = true;
				this.isSnoze = false;
			}
		}
	}
}