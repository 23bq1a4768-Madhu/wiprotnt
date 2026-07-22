package com.wipro.race;

public class RaceThread extends Thread {

    private boolean hareSleep;

    public RaceThread(String name, boolean hareSleep) {
        super(name);
        this.hareSleep = hareSleep;
    }

    @Override
    public void run() {

        for (int meter = 1; meter <= 100; meter++) {

            System.out.println(getName() + " ran " + meter + " meters");

            if (hareSleep && getName().equals("Hare") && meter == 60) {
                try {
                    System.out.println("Hare is sleeping for 1000 milliseconds...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(getName() + " finished the race!");
    }
}