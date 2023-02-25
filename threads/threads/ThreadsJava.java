package threads;

public class ThreadsJava extends Thread {
    
    public void run(){
        System.out.println("Minha Thread secundaria.");
    }

    public static void main(String[] args){

        ThreadsJava secundThread = new ThreadsJava();
        secundThread.start();
        System.out.println("Thread Principal!");

    }

}
