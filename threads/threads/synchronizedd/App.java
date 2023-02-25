package threads.synchronizedd;

public class App {
    
    //Com sincronização

    public static void main(String[] args){

        ListaNumeros listaNumeros = new ListaNumeros();
        TheadEsteendida1 minhaThread1 = new TheadEsteendida1(listaNumeros);
        TheadEsteendida2 minhaThread2 = new TheadEsteendida2(listaNumeros);
        minhaThread1.start();
        minhaThread2.start();

    }
}
