
public class SimpleTime {
	private int hour, minute, second;

	public SimpleTime() {
		this.hour = this.minute = this.second = 0;
	}

	public SimpleTime(int hour, int minute, int second) {
		int error = setTime(hour, minute, second);
		// error = setHour(hour) * 100;
		// error += setMinute(minute) * 10;
		// error += setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public int setHour(int hour) {
		if (hour <= 23 && hour >= 0) {
			this.hour = hour;
			return 0;
		}
		this.hour = 0;
		return 1;
	}

	public int getMinute() {
		return minute;
	}

	public int setMinute(int minute) {
		if (minute <= 59 && minute >= 0) {
			this.minute = minute;
			return 0;
		}
		this.minute = 0;
		return 2;
	}

	public int getSecond() {
		return second;
	}

	public int setSecond(int second) {
		if (second <= 59 && second >= 0) {
			this.second = second;
			return 0;
		}
		this.second = 0;
		return 3;
	}

	public int setTime(int hour, int minute, int second) {
		int error = 0;
		error = setHour(hour) * 100;
		error += setMinute(minute) * 10;
		error += setSecond(second);
		return error;
	}

	public void add(SimpleTime simpleTime) {
		addSecond(simpleTime.second);
		addMinuts(simpleTime.minute);
		addHours(simpleTime.hour);

	}

	public boolean addSecond(int second) {
		if (second < 0)
			return false;
		this.second += second;
		addMinuts(this.second / 60);
		this.second = this.second % 60;
		return true;
	}

	public boolean addMinuts(int minute) {
		if (minute < 0)
			return false;
		this.minute += minute;
		addHours(this.minute / 60);
		this.minute = this.minute % 60;
		return true;
	}

	public boolean addHours(int hour) {
		if (hour < 0)
			return false;
		this.hour += hour;
		this.hour = this.hour % 24;
		return true;
	}

	public void tick() {
		addSecond(1);
	}

	public boolean equals(SimpleTime simpleTime) {
		if (simpleTime.hour == this.hour && simpleTime.minute == this.minute && simpleTime.second == this.second)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return String.format("the time is ==> %1$02d:%2$02d:%3$02d", getHour(), getMinute(), getSecond());
	}
}
