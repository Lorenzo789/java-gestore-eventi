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
//		System.out.print("You wanna check the es 1/2 3 or 4? ");
//		int esToDo = sc.nextInt();
//		
//		if((esToDo == 1) || (esToDo == 2)) {
//			
//			milestoneOneAndTwo();
//			
//		} else if (esToDo == 3) {
//			
//			milestoneTrhee();
//			
//		} else {
//			
//			milestoneFour();
//			
//		}
		
	}
	


	public static void milestoneOneAndTwo() throws Exception {
		
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
			
			Evento ev1 = new Evento(title, dateStr, seat);
			
			System.out.println("||-------------------------------------------------------------||");
			System.out.println(ev1 == null ? "the event could not be created" : ev1 );
			System.out.println("||-------------------------------------------------------------||");
			
			System.out.print("Do you want to take a reservation or cancel an active reservation? 1/2 ");
			int reservation = sc.nextInt();
			
			if(reservation == 1) {
				
				
				System.out.print("how many reservations you want to do? ");
				int reservationAnswear = sc.nextInt();
				
				if(reservationAnswear > 0) {
					for(int x = 0; x < reservationAnswear; x++) {
						
						ev1.reserveSeat();
					}
					System.out.println(ev1);
					
				}
				System.out.println("||-------------------------------------------------------------||");
				
			} else if (reservation == 2){
				
				System.out.print("how many reservations you want to cancel? ");
				int reservationToCancel = sc.nextInt();
				
				for (int y = 0; y < reservationToCancel; y++) {
					
					ev1.cancelReservation();
					System.out.println(ev1);
				}
				System.out.println("||-------------------------------------------------------------||");	
			}
		}
	}
	
	public static void milestoneTrhee() throws Exception {
		
		Evento	ev3 = new Evento("ciao", "2023-07-10", 200);
		Evento	ev4 = new Evento("ciaone", "2023-07-10", 250);
		Evento	ev7 = new Evento("ciaone2", "2023-07-18", 270);
		Evento	ev8 = new Evento("ciaone3", "2023-07-19", 220);
		Evento	ev5 = new Evento("bella", "2023-08-10", 20);
		Evento	ev6 = new Evento("hello", "2023-06-15", 500);
		
		ProgrammEventi bigEvents = new ProgrammEventi("baldoria summer");

		bigEvents.addEvent(ev3);
		bigEvents.addEvent(ev4);
		bigEvents.addEvent(ev5);
		bigEvents.addEvent(ev6);
		bigEvents.addEvent(ev7);
		bigEvents.addEvent(ev8);
	
		System.out.println("||-------------------------------------------------------------||");
		System.out.println("The result of get event in date 2023-07-10 is:");
		System.out.println(bigEvents.getEventInDate(LocalDate.parse("2023-07-10")));
		
		System.out.println("||-------------------------------------------------------------||");
		System.out.println("the count of the event present in big events is:");
		System.out.println(bigEvents.getCountEventInProgramm());
		
		System.out.println("||-------------------------------------------------------------||");
		System.out.println("The next event on your programm are:");
		System.out.println(bigEvents.sortProgram());
		System.out.println("||-------------------------------------------------------------||");
		
		
		bigEvents.clearEventsInProgramm();
				
	}
	
	public static void milestoneFour() throws Exception {
		
		Concerto vasco = new Concerto("vasco show", "2023-11-10", 300, 12, 30, "80");
		
		System.out.println(vasco);
		
	}
}
