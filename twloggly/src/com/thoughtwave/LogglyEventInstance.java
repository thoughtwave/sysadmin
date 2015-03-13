package com.thoughtwave;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jrk on 3/11/15.
 */
@JsonIgnoreProperties(ignoreUnknown=true)

public class LogglyEventInstance {
    private LogglySyslogEntry syslog;

    public LogglySyslogEntry getSyslog() { return syslog; }
    public void setSyslog(LogglySyslogEntry syslog) { this.syslog = syslog; }
}
