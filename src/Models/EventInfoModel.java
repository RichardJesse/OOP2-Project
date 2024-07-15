package Models;

import Models.EventModel;
import Models.TicketLevelModel;

public class EventInfoModel {

    private EventModel event;
    private TicketLevelModel ticketLevel;

    // Constructors, getters, and setters
    public EventInfoModel(EventModel event, TicketLevelModel ticketLevel) {
        this.event = event;
        this.ticketLevel = ticketLevel;
    }

    public EventModel getEvent() {
        return event;
    }

    public void setEvent(EventModel event) {
        this.event = event;
    }

    public TicketLevelModel getTicketLevel() {
        return ticketLevel;
    }

    public void setTicketLevel(TicketLevelModel ticketLevel) {
        this.ticketLevel = ticketLevel;
    }

    @Override
    public String toString() {
        return "EventInfo{" + "event=" + event + ", ticketLevel=" + ticketLevel + '}';
    }
}
