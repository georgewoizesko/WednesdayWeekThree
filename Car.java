package com.WeekThreeAssessment;

public class Car extends Vehicle {
	
	public int doors = 0;
	public int windows = 0;
	public int seats = 0;
	public int speakers = 0;
	public String color = null;
	
	
	public Car(int doors, int windows, int seats, int speakers, String color) {
		this.doors = doors;
		this.windows = windows;
		this.seats = seats;
		this.speakers = speakers;
		this.color = color;
	}
	
	public Car() {
	}
	
	
	
	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getSpeakers() {
		return speakers;
	}

	public void setSpeakers(int speakers) {
		this.speakers = speakers;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void starts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moves() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Car [doors=" + doors + ", windows=" + windows + ", seats=" + seats + ", speakers=" + speakers
				+ ", color=" + color + "]";
	}

	
	
}
