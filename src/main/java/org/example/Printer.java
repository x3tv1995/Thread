package org.example;

public class Printer implements Runnable{
    private  String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {


            System.out.println("Привет, " + this.name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
