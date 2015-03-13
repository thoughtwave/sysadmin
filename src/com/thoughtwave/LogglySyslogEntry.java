package com.thoughtwave;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jrk on 3/11/15.
 */
@JsonIgnoreProperties(ignoreUnknown=true)


public class LogglySyslogEntry {
    private String priority;
    private String timestamp;
    private String host;
    private String severity;
    private String facility;

    public String getPriority() { return priority; }
    public String getTimestamp() { return timestamp; }
    public String getHost() { return host; }
    public String getSeverity() { return severity; }
    public String getFacility() { return facility; }

    public void setPriority(String priority) { this.priority = priority; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
    public void setHost(String host) { this.host = host; }
    public void setSeverity(String severity) { this.severity = severity; }
    public void setFacility(String facility) { this.facility = facility; }

}
