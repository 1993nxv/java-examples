package threads;

public class TheadEsteendida1 extends Thread {
    
    ListaNumeros listaNumeros;

    TheadEsteendida1(ListaNumeros listaNumeros){
        this.listaNumeros = listaNumeros;
    }

    public void run(){
        listaNumeros.printTable(300);
    }
}
