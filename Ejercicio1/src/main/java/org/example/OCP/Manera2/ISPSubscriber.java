package org.example.OCP.Manera2;

import java.util.List;

public class ISPSubscriber extends Subscriber{
    private long freeUsage;

    public ISPSubscriber() {
    }

    @Override
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;

        if (chargeableData <= 0){
            return 0;
        }

        return chargeableData*getBaseRate()/100;
    }


    public long getFreeUsage() {
        return freeUsage;
    }

    /**
     * @param freeUsage the freeUsage to set
     */
    public void setFreeUsage(long freeUsage) {
        this.freeUsage = freeUsage;
    }

}
