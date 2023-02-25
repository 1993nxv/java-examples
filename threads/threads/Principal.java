package threads;

public class Principal {
    public static void main(String[] args){

        ImpRunnable impRunnable = new ImpRunnable();
        Thread secundThread = new Thread(impRunnable);
        secundThread.start();
        System.out.println("Thread Principal!");

    }
}
