package uk.ac.belfastmet.Formsevents.domain;

import java.util.ArrayList;

public class Allevents {
	ArrayList<Event> allEvents;
	
	public Allevents(ArrayList<Event> allEvents) {
		super();
		this.allEvents = allEvents;
	}

	

	public Allevents() {
		super();
	}



	public ArrayList<Event> getAllEvents() {
		return allEvents;
	}

	public void setAllEvents(ArrayList<Event> allEvents) {
		this.allEvents = allEvents;
	}
}
