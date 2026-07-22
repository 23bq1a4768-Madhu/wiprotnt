package com.wipro.runnable;

import java.util.Random;

public class ColourRunnable implements Runnable {

    String colours[] = {
            "white",
            "blue",
            "black",
            "green",
            "red",
            "yellow"
    };

    @Override
    public void run() {

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                System.out.println("Red Found. Stopping...");
                break;
            }

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}