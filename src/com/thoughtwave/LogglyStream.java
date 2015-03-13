package com.thoughtwave;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jrk on 3/11/15.
 */
@JsonIgnoreProperties(ignoreUnknown=true)

public class LogglyStream {
    private int page;
    private int total_events;
    private List<LogglyEvent> events;

    public int getPage() { return page; }
    public int getTotal_events() { return total_events; }
    public List<LogglyEvent> getEvents() { return events; }
    public void setEvents(List<LogglyEvent> events) { this.events = events; }

    public void setPage(int page) { this.page = page; }
    public void setTotal_events(int total_events) { this.total_events = total_events; }
}

