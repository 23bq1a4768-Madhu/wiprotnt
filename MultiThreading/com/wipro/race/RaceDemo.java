package com.wipro.race;

public class RaceDemo {

    public static void main(String[] args) {

        System.out.println("=== Hare and Tortoise Race ===");

        Thread hare = new RaceThread("Hare", true);
        Thread tortoise = new RaceThread("Tortoise", false);

        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}