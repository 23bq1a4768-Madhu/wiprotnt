package com.wipro.threads;

public class ThreadDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("Scooby");
        MyThread t2 = new MyThread("Shaggy");

        t1.start();
        t2.start();
    }
}