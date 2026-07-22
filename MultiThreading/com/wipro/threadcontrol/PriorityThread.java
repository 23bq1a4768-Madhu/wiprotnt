package com.wipro.threadcontrol;

public class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for(int i=1;i<=5;i++) {
            System.out.println(
                    getName() +
                    " Priority = " +
                    getPriority() +
                    " Count = " + i);
        }
    }
}