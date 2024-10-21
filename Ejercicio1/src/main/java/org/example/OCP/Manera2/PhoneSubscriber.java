package org.example.OCP.Manera2;

import java.util.List;

public class PhoneSubscriber extends Subscriber{

    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration* getBaseRate() /100;
    }

}
