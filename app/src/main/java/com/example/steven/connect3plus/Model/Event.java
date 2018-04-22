package com.example.steven.connect3plus.Model;

public class Event {
    private String EventId;
    private String EventName;
    private String EventCategory;
    private String EventLocation;
    private String EventTime;
    private String EventDate;
    private String EventDesc;

    public Event(String eventId, String eventName, String eventCategory, String eventLocation, String eventTime, String eventDate, String eventDesc) {
        EventId = eventId;
        EventName = eventName;
        EventCategory = eventCategory;
        EventLocation = eventLocation;
        EventTime = eventTime;
        EventDate = eventDate;
        EventDesc = eventDesc;
    }

    public String getEventId() {
        return EventId;
    }

    public void setEventId(String eventId) {
        EventId = eventId;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public String getEventCategory() {
        return EventCategory;
    }

    public void setEventCategory(String eventCategory) {
        EventCategory = eventCategory;
    }

    public String getEventLocation() {
        return EventLocation;
    }

    public void setEventLocation(String eventLocation) {
        EventLocation = eventLocation;
    }

    public String getEventTime() {
        return EventTime;
    }

    public void setEventTime(String eventTime) {
        EventTime = eventTime;
    }

    public String getEventDate() {
        return EventDate;
    }

    public void setEventDate(String eventDate) {
        EventDate = eventDate;
    }

    public String getEventDesc() {
        return EventDesc;
    }

    public void setEventDesc(String eventDesc) {
        EventDesc = eventDesc;
    }
}
