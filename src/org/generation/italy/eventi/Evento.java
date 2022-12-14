package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {

	private String title;
	private LocalDate date;
	private int totalSeatNumber;
	private int reservedSeatNumber;
	
	public Evento(String title, String date, int totalSeatNumber) throws Exception {
		
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

	public void setDate(String date) throws Exception {
		
		LocalDate formattedDate = LocalDate.parse(date);
		
		if(formattedDate.isBefore(LocalDate.now())) {
			
			throw new Exception("The inserted date is invalid");
		}
		this.date = formattedDate;
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
	
	protected int seatAvailable() {
		
		if(reservedSeatNumber > 0) {
			return getTotalSeatNumber() - getReservedSeatNumber();
		}
		return getTotalSeatNumber();
	}
	
	public boolean equalsEvent(Evento ev) {
		
		if(getTitle() == ev.getTitle() && getDate().isEqual(ev.getDate())) {
			
			return true;
		} else {
			
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "\nThe title is: " + getTitle()
		+ "\nThe date is: " + getDate()
		+ "\nThe total seat number are: " + getTotalSeatNumber()
		+ "\nThe number of seat available are: " + seatAvailable()
		+ "\nThe total seat reservated are: " + getReservedSeatNumber();
	}
	
}
