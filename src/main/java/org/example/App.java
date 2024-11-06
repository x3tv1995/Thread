package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
       Printer printer1 = new Printer("Я поток 1");
       Thread thread1 = new Thread( printer1 );
       thread1.start();
       Printer printer2 = new Printer("Я поток 2");
       Thread thread2 = new Thread( printer2 );
       thread2.start();
        System.out.println();
      Printer2 printer3 = new Printer2("Я поток 3");
      printer3.start();
      Printer2 printer4 = new Printer2("Я поток 4");
      printer4.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Работает главный поток");
            Thread.sleep(2000);
        }




    }
}
