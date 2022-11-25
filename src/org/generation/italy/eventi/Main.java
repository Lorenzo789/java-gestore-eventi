package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("You wanna Insert a new Event: y/n ");
		String answer = sc.nextLine();
		
		if(answer.equals("y")) {
			
			System.out.print("insert your event title ");
			String title = sc.nextLine();
			
			System.out.print("insert your event date yyyy-mm-dd ");
			String dateStr = sc.nextLine();
			
			System.out.print("insert your event number of seat ");
			int seat = sc.nextInt();
			
			LocalDate date = LocalDate.parse(dateStr);
			
			Evento ev1 = null;
			try {
				 ev1 = new Evento(title, date, seat);
			} 
			catch (Exception e) {
				System.err.println(e.getMessage());
			} 
			finally {
				System.out.println("||-------------------------------------------------------------||");
				System.out.println(ev1 == null ? "the event could not be created" : ev1 );
				System.out.println("||-------------------------------------------------------------||");
			}
			
			System.out.print("how many reservations you want to do? ");
			int reservationAnswear = sc.nextInt();
			
			if(reservationAnswear > 0) {
				for(int x = 0; x < reservationAnswear; x++) {
					
					try {
						ev1.reserveSeat();
					} 
					catch (Exception e) {
						System.err.println(e.getMessage());
					}
				}
				System.out.println(ev1);
			}
			System.out.println("||-------------------------------------------------------------||");

			System.out.print("how many reservations you want to cancel? ");
			int reservationToCancel = sc.nextInt();
			
			for (int y = 0; y < reservationToCancel; y++) {
				
				try {
					ev1.cancelReservation();
				} 
				catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
			System.out.println(ev1);
			System.out.println("||-------------------------------------------------------------||");	
		}
	}
}
