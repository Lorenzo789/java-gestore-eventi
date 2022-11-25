package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Concerto extends Evento {

	private LocalTime hour;
	private BigDecimal price;
	
	public Concerto(String title, String date, int totalSeatNumber, int hour, int minute, String price) throws Exception {
		super(title, date, totalSeatNumber);
		
		setHour(hour, minute);
		formattedPrice(price);
	}

	//getter and setter
	public LocalTime getHour() {
		return hour;
	}

	public void setHour(int hour, int minute) {
		
		LocalTime time = LocalTime.of(hour, minute);
		
		this.hour = time;
	}

	public float getPrice() {
		return price.floatValue();
	}
	
	private void formattedPrice(String price) {
		this.price = new BigDecimal(price);
	}
	//getter and setter
	
	
	
	@Override
	public String toString() {
		return "\nThe title is: " + getTitle()
		+ "\nThe date is: " + getDate()
		+ "\nThe hour is: " + getHour()
		+ "\nThe price is: " + getPrice() + "€";
	}
}
