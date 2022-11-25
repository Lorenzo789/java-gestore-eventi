package org.generation.italy.eventi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("You wanna Insert a new Event: y/n ");
//		String answer = sc.nextLine();
		
//		if(answer.equals("y")) {
//			
//			System.out.print("insert your event title ");
//			String title = sc.nextLine();
//			
//			System.out.print("insert your event date yyyy-mm-dd ");
//			String dateStr = sc.nextLine();
//			
//			System.out.print("insert your event number of seat ");
//			int seat = sc.nextInt();
//			
//			LocalDate date = LocalDate.parse(dateStr);
//			
//			Evento ev1 = null;
//			try {
//				 ev1 = new Evento(title, date, seat);
//			} 
//			catch (Exception e) {
//				System.err.println(e.getMessage());
//			} 
//			finally {
//				System.out.println("||-------------------------------------------------------------||");
//				System.out.println(ev1 == null ? "the event could not be created" : ev1 );
//				System.out.println("||-------------------------------------------------------------||");
//			}
//			
//			System.out.print("how many reservations you want to do? ");
//			int reservationAnswear = sc.nextInt();
//			
//			if(reservationAnswear > 0) {
//				for(int x = 0; x < reservationAnswear; x++) {
//					
//					try {
//						ev1.reserveSeat();
//					} 
//					catch (Exception e) {
//						System.err.println(e.getMessage());
//					}
//				}
//				System.out.println(ev1);
//			}
//			System.out.println("||-------------------------------------------------------------||");
//
//			System.out.print("how many reservations you want to cancel? ");
//			int reservationToCancel = sc.nextInt();
//			
//			for (int y = 0; y < reservationToCancel; y++) {
//				
//				try {
//					ev1.cancelReservation();
//				} 
//				catch (Exception e) {
//					System.err.println(e.getMessage());
//				}
//			}
//			System.out.println(ev1);
//			System.out.println("||-------------------------------------------------------------||");	
//		}
		
		//milestone3
//		Evento	ev3 = new Evento("ciao", LocalDate.parse("2023-07-10"), 200);
//		Evento	ev4 = new Evento("ciaone", LocalDate.parse("2023-07-10"), 250);
//		Evento	ev7 = new Evento("ciaone2", LocalDate.parse("2023-07-18"), 270);
//		Evento	ev8 = new Evento("ciaone3", LocalDate.parse("2023-07-19"), 220);
//		Evento	ev5 = new Evento("bella", LocalDate.parse("2023-08-10"), 20);
//		Evento	ev6 = new Evento("hello", LocalDate.parse("2023-06-15"), 500);
			
//		List<Evento> events = new ArrayList<Evento>();
		
//		ProgrammEventi bigEvents = new ProgrammEventi("baldoria summer");
//
//		bigEvents.addEvent(ev3);
//		bigEvents.addEvent(ev4);
//		bigEvents.addEvent(ev5);
//		bigEvents.addEvent(ev6);
//		bigEvents.addEvent(ev7);
//		bigEvents.addEvent(ev8);
	

//		System.out.println(bigEvents.getEventInDate(LocalDate.parse("2023-07-10")));
//		System.out.println(bigEvents.getCountEventInProgramm());
		
//		bigEvents.clearEventsInProgramm();
		
//		bigEvents.getEventInDate(LocalDate.parse("2022-07-09"));
		
//		System.out.print(bigEvents.sortProgram());
		//milestone3
		
		//milestone4
		Concerto vasco = new Concerto("vasco show", "2023-11-10", 300, 12, 30, "80");
		
		System.out.println(vasco);
		//milestone4
	}
}
