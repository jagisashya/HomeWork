
public class AlarmClock extends SimpleTime{
//	ExtentedTime currentTime;
	Alarm [] alarmTime = new Alarm[5];
	
	public AlarmClock() {
//		this.currentTime = new ExtentedTime();
		super();
		for (int i=0; i< alarmTime.length; i++) {
			this.alarmTime[i] = new Alarm();
		}
	}
	
	public void setAlarm (int alarmNumber, SimpleTime simpleTime,boolean is24Hours,boolean isSet,int snoozeTime,boolean isSnooze) {
		this.alarmTime[alarmNumber-1].setTime(simpleTime.getHour(),simpleTime.getMinute(),
										    simpleTime.getSecond());
		this.alarmTime[alarmNumber-1].setIs24Hours(is24Hours);
		this.alarmTime[alarmNumber-1].setSet(isSet);
		this.alarmTime[alarmNumber-1].setSnoozeTime(snoozeTime);
		this.alarmTime[alarmNumber-1].setSnoze(isSnooze);
	}
	public void setAlarm (int alarmNumber, int hour,int minute,int second,boolean is24Hours,boolean isSet,int snoozeTime,boolean isSnooze) {
		this.alarmTime[alarmNumber-1].setTime(hour,minute,second);
		this.alarmTime[alarmNumber-1].setIs24Hours(is24Hours);
		this.alarmTime[alarmNumber-1].setSet(isSet);
		this.alarmTime[alarmNumber-1].setSnoozeTime(snoozeTime);
		this.alarmTime[alarmNumber-1].setSnoze(isSnooze);
	}
	
	
	

}
