package collection;

import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args){

        TreeMap<Integer, String> pessoas = new  TreeMap<>();

        pessoas.put(1, "Delmondes");
        pessoas.put(2, "Bruna");

        System.out.println("Chaves: "+ pessoas.keySet());
        System.out.println("Valores: "+ pessoas.values());
        System.out.println("Chave|Valor: "+ pessoas.entrySet());

    }
}
