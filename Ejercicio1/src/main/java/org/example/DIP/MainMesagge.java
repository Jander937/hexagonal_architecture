package org.example.DIP;

import java.io.IOException;
import java.io.PrintWriter;

public class MainMesagge {
    public static void main(String[] args) throws IOException {

        Message msg = new Message("This is a message again");
        MessagePrinter printer = new MessagePrinter();
        try(PrintWriter writer = new PrintWriter(System.out)){
        printer.writeMessage(msg,  new JSONFormatter(), writer);
        }
    }
}
