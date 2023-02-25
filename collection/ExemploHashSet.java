package collection;

import java.util.HashSet;

public class ExemploHashSet {
    
    public static void main(String[] args){

        HashSet<String> nomes = new HashSet<>();

        nomes.add("Delmondes");
        nomes.add("Bruna");
        nomes.add("Delmondes");
        
        System.out.println(nomes);

        nomes.clear();

        System.out.println(nomes.contains("Delmondes"));

    }
}
