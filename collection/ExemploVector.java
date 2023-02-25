package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import java.util.Iterator;


public class ExemploVector {

    public static void main(String[] args){

        Vector<String> nomes = new Vector<>();

        nomes.add(0, "Delmondes");
        nomes.add(1, "Lucas");
        nomes.add(2, "Lourrana");
        nomes.add(3, "Sandramar");
        nomes.add(4, "Bruna");

        // Uso Iterator
        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        System.out.println();

        // Uso Comparator
        Comparator<String> comparator = Collections.reverseOrder();

        Collections.sort(nomes, comparator);

        System.out.println("Elementos apos a ordenação");

        for(String nome : nomes){
            System.out.println(nome);
        }

    }
}

