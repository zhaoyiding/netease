package e2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}

}

class Display {
	private int value;
	private int limit;

	public Display(int limit) {
		super();
		this.limit = limit;
	}

	public void increase() {
		if (++value == limit) {
			value = 0;
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

class Clock {
	private Display hour;
	private Display minute;
	private Display second;

	public Clock(int hour, int minute, int second) {
		super();
		this.hour = new Display(24);
		this.hour.setValue(hour);

		this.minute = new Display(60);
		this.minute.setValue(minute);

		this.second = new Display(60);
		this.second.setValue(second);
	}

	public void tick() {
		second.increase();
		if (second.getValue() == 0) {
			minute.increase();
			if (minute.getValue() == 0) {
				hour.increase();
			}
		}
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour.getValue(), minute.getValue(), second.getValue());
	}
}