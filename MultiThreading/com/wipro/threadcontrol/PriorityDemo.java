package com.wipro.threadcontrol;

public class PriorityDemo {

    public static void main(String[] args) {

        PriorityThread t1 =
                new PriorityThread("MAX");

        PriorityThread t2 =
                new PriorityThread("MIN");

        PriorityThread t3 =
                new PriorityThread("NORM");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}