package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkedHashMap {
    
    public static void main(String[] args){

        Map<Integer, String> linguagens = new LinkedHashMap<>();

        linguagens.put(1, "Java");
        linguagens.put(2, "Kotlin");
        linguagens.put(3, "JavaScript");

        System.out.println("Conteudo do Hashtable: " + linguagens);

        System.out.println("Elemento da chave 2: " + linguagens.get(2));
        System.out.println("Chaves: " + linguagens.keySet());
        System.out.println("Valores: " + linguagens.values());
        System.out.println("Chave/Valor: " + linguagens.entrySet());

        LinkedHashMap<Integer, String> testeClone = new LinkedHashMap<>();
        testeClone.putAll(linguagens);

        System.out.println(testeClone.get(3));

    }
}
