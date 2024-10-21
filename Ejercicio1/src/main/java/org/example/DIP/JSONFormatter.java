package org.example.DIP;

public class JSONFormatter implements Formatter{

    public String format(Message message) throws FormatException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(message);
    }
}

