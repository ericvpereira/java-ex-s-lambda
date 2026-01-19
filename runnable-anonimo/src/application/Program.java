package application;

public class Program {

    public static void main(String[] args) {

        Thread t = new Thread(() -> {
           for (int i = 1; i <= 5; i++) {
               System.out.println("Executando thread...");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   Thread.currentThread().interrupt();
               }
           }
        });
        t.start();
    }

}
