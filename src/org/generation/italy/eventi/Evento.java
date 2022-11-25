package org.generation.italy.eventi;

import java.time.LocalDate;

public class Evento {

	private String title;
	private LocalDate date;
	private int totalSeatNumber;
	private int reservedSeatNumber;
	
	public Evento(String title, LocalDate date, int totalSeatNumber) throws Exception {
		
		setTitle(title);
		setDate(date);

		if(totalSeatNumber <= 0) {
			throw new Exception("the numer must be bigger than 0");
		}
		else{
			this.totalSeatNumber = totalSeatNumber;
		}
//		this.totalSeatNumber = totalSeatNumber;
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

	public void setDate(LocalDate date) throws Exception {
		
		if(date.isBefore(LocalDate.now())) {
			
			throw new Exception("The inserted date is invalid");
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
	
	public int reserveSeat() throws Exception {
		
		if(date.isBefore(LocalDate.now()) || totalSeatNumber == 0) {
			
			throw new Exception("is impossible reserve a seat,"
			+ " the event is already over or the seats are all already taken");
		}
		return reservedSeatNumber++;
	}
	
	public int cancelReservation() throws Exception {
		
		if(date.isBefore(LocalDate.now()) || reservedSeatNumber == 0) {
			
			throw new Exception("is impossible to cancel a reservation"
					+ "the event is already over or are not reservation seat");
		}
		return reservedSeatNumber--;
		
	}
	
	private int seatAvailable() {
		
		if(reservedSeatNumber > 0) {
			return getTotalSeatNumber() - getReservedSeatNumber();
		}
		return getTotalSeatNumber();
	}
	
	
	@Override
	public String toString() {
		return "The title is: " + getTitle()
		+ "\nThe date is: " + getDate()
		+ "\nThe total seat number are: " + getTotalSeatNumber()
		+ "\nThe number of seat available are: " + seatAvailable()
		+ "\nThe total seat reservated are: " + getReservedSeatNumber();
	}
	
}
