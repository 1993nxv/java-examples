package threads;

public class TheadEsteendida2 extends Thread {

    ListaNumeros listaNumeros;

    TheadEsteendida2(ListaNumeros listaNumeros){
        this.listaNumeros = listaNumeros;
    }

    public void run(){
        listaNumeros.printTable(1000);
    }

}
