package org.example.DIP;

import java.io.IOException;

public class FormatException extends IOException {

    public FormatException(JsonProcessingException cause) {
        super(cause);
    }
}
