package com.wipro.runnable;

public class ColourDemo {

    public static void main(String[] args) {

        ColourRunnable cr = new ColourRunnable();

        Thread t = new Thread(cr);

        t.start();
    }
}