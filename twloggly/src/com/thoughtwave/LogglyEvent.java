package com.thoughtwave;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by jrk on 3/11/15.
 */

@JsonIgnoreProperties(ignoreUnknown=true)

public class LogglyEvent {
    private List<String> tags;
    private BigInteger timestamp;
    private String logmsg;
    private LogglyEventInstance event;
    private List<String> logtypes;
    private String id;


    public List<String> getTags() { return tags; }
    public void setTags(List<String> tags) { this.tags = tags; }

    public BigInteger getTimestamp() { return timestamp; }
    public void setTimestamp(BigInteger timestamp) { this.timestamp = timestamp; }

    public String getLogmsg() { return logmsg; }
    public void setLogmsg() { this.logmsg = logmsg; }

    public LogglyEventInstance getEvent() { return event; }
    public void setEvent(LogglyEventInstance event) { this.event = event; }

    public List<String> getLogtypes() { return logtypes; }
    public void setLogtypes(List<String> logtypes) { this.logtypes = logtypes; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
}
