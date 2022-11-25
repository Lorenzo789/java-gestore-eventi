package org.generation.italy.eventi;

import java.time.LocalDate;

public class Evento {

	private String title;
	private LocalDate date;
	private int totalSeatNumber;
	private int reservedSeatNumber;
	
	public Evento(String title, LocalDate date, int totalSeatNumber) throws IllegalArgumentException {
		
		setTitle(title);
		setDate(date);

		if(this.totalSeatNumber > 0) {
			this.totalSeatNumber = totalSeatNumber;
		}
		else {
			
			throw new IllegalArgumentException("the numer must be bigger than 0");
		}
		
		reservedSeatNumber = 0;
		
	}

	//setter and getter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) throws IllegalArgumentException {
		
		if(date.isBefore(LocalDate.now())) {
			
			throw new IllegalArgumentException("The inserted date is invalid");
		}
		this.date = date;
	}

	public int getTotalSeatNumber() {
		return totalSeatNumber;
	}

	public int getReservedSeatNumber() {
		return reservedSeatNumber;
	}
	//setter and getter
	
	public int reserveSeat() throws IllegalArgumentException {
		
		if(date.isBefore(LocalDate.now()) || totalSeatNumber == 0) {
			
			throw new IllegalArgumentException("is impossible reserve a seat,"
			+ " the event is already over or the seats are all already taken");
		}
		return reservedSeatNumber + 1;
	}
	
	public int cancelReservation() throws IllegalArgumentException {
		
		if(date.isBefore(LocalDate.now()) || reservedSeatNumber == 0) {
			
			throw new IllegalArgumentException("is impossible to cancel a reservation"
					+ "the event is already over or are not reservation seat");
		}
		return reservedSeatNumber - 1;
		
	}
	
	
	@Override
	public String toString() {
		return "The title is: " + getTitle()
		+ "\nThe date is: " + getDate()
		+ "\nThe total seat number are: " + getTotalSeatNumber()
		+ "\nThe total seat reservated are: " + getReservedSeatNumber();
	}
	
}
