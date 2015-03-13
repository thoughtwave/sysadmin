package com.thoughtwave;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Scanner;

@JsonIgnoreProperties(ignoreUnknown=true)

public class Main {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
            Scanner console = new Scanner(System.in);


            String inputJson = console.useDelimiter("\\Z").next();

            com.thoughtwave.LogglyStream le = mapper.readValue(inputJson, com.thoughtwave.LogglyStream.class);

            for (int index = 0; index < 50; index++) {
                String linuxHost = le.getEvents().get(index).getEvent().getSyslog().getHost();
                List<String> tags = le.getEvents().get(index).getTags();
                String logMessage = le.getEvents().get(index).getLogmsg();
                String logglyTS = le.getEvents().get(index).getEvent().getSyslog().getTimestamp();
                System.out.printf("%s %s %s %s\n",logglyTS, tags, linuxHost, logMessage);
            }
        } catch ( Exception ex )
        {
            System.out.println(ex);
        }


    }
}
