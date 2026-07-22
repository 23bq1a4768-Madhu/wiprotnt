package com.wipro.threadcontrol;

public class OddThread extends Thread {

    @Override
    public void run() {

        for(int i=1;i<=20;i+=2) {
            System.out.println(i);
        }
    }
}