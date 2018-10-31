
import java.util.Scanner;

public class ApplAlarmClock {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
		System.out.println("Enter with the time:");
		SimpleTime timeEzer = inputTime();
		ExtentedTime time = new ExtentedTime(timeEzer.getHour(), timeEzer.getMinute(), timeEzer.getSecond(), true);
		System.out.println(timeEzer);
		
		
		AlarmClock alarmClock = new AlarmClock();

			System.out.println("Enter with the alarm time1: ");
			timeEzer = inputTime();
			alarmClock.setAlarm(1, timeEzer, true, true,5, true);
			System.out.println(timeEzer);


			System.out.println("Enter with the alarm time2:");
			timeEzer = inputTime();
			alarmClock.setAlarm(2, timeEzer.getHour(), timeEzer.getMinute(), timeEzer.getSecond(), true, true, 5, true);
			System.out.println(timeEzer);

			for (int i=0;i<1000; i++) {
				time.tick();
				System.out.println(time);
				for (int y=0; y < alarmClock.alarmTime.length;y++)
				alarmClock.alarmTime[y].timeToWakeUp(time);

			}

		System.out.println("----------------- T H E      E N D -----------------");
//		input.close();
	}

	public static SimpleTime inputTime() {

		Scanner input = new Scanner(System.in);
		SimpleTime simpleTime = new SimpleTime();
		// eturn simpleTime;
		System.out.println("Enter the time in format HH:MM:SS");
		String time = input.next();

		boolean isinformat = false;

		while (!isinformat) {
			String[] hhmmdd = time.split(":");
			if (hhmmdd.length != 3) {
				System.out.println("Please enter the time in the format HH:MM:SS");
				time = input.next();
				continue;
			} else if (hhmmdd[0].matches("[0-9]*") && hhmmdd[1].matches("[0-9]*") && hhmmdd[2].matches("[0-9]*")) {
				isinformat = true;
				simpleTime = new SimpleTime(Integer.valueOf(hhmmdd[0]), Integer.parseInt(hhmmdd[1]),
						Integer.parseInt(hhmmdd[2]));
				System.out.println(hhmmdd[0] + ":" + hhmmdd[1] + ":" + hhmmdd[2]);
			} else {
				System.out.println("Please enter the time in the format HH:MM:SS");
				time = input.next();
				continue;
			}

		}
		return simpleTime;

	}

}
