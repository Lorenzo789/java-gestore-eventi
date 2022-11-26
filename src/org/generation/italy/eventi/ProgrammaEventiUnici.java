package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgrammaEventiUnici {

	private String title;
	private Set<Evento> uniqueEvents; 
	private List<Evento> events;
	
	public ProgrammaEventiUnici(String title) {
		
		setTitle(title);
		uniqueEvents = new HashSet<>();
		events = new ArrayList<>();
	}

	//setter and getter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public List<Evento> getEvents() {
		return events;
	}
	
	public void setEvents(List<Evento> events) {
		this.events = events;
	}
	public Set<Evento> getUniqueEvents() {
		return uniqueEvents;
	}
	//setter and getter

	public void addEvent(Evento eventToAdd){
		events.add(eventToAdd);
	}
	
	public Set<Evento> getEventInDate(LocalDate date){
		
		Set<Evento> dateList = new HashSet<Evento>();
		
		for(Evento ev : events) {
			
			if(ev.getDate().equals(date)) {
				
				dateList.add(ev);
			}
		}
		return dateList;
	}
	
	public int getCountEventInProgramm(){
		return events.size();
	}
	
	public void clearEventsInProgramm(){
		events.clear();
	}
	
	public List<String> sortProgram() {
		
		List<String> eventsProgrammFormatted = new ArrayList<>();
		
		Comparator<Evento> comparatorAsc = (event1, event2) -> event1.getDate().compareTo(event2.getDate());
		
		Collections.sort(events, comparatorAsc);
		
		for(Evento event : events) {
			
			String formattedProgrammEvent = event.getTitle() + " - " + event.getDate();
			eventsProgrammFormatted.add(formattedProgrammEvent);
		}
		return eventsProgrammFormatted;
	}
	
	
	@Override
	public String toString() {
		return "Title of your program: " + getTitle()
		+ "\nProgramm: " + getEvents();
	}
}
