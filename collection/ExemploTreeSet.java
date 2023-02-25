package collection;

import java.util.TreeSet;

public class ExemploTreeSet {
    
    public static void main(String[] args){

        TreeSet<String> nomes = new TreeSet<>();

        nomes.add("Delmondes");
        nomes.add("Bruna");

        nomes.remove("Bruna");

        System.out.println(nomes);

        nomes.add("Bruna");

        System.out.println(nomes);

    }
}
