import java.util.HashMap;


public class ExemploHashMap {
    
    public static void main(String[] args){

        HashMap<Integer, String> linguagens = new HashMap<>();
        linguagens.put(1, "Java");
        linguagens.put(2, "Kotlin");
        linguagens.put(3, "JavaScript");

        System.out.println("Conteudo do HashMap: " + linguagens);

        System.out.println("Elemento da chave 2: " + linguagens.get(2));
        System.out.println("Chaves: " + linguagens.keySet());
        System.out.println("Valores: " + linguagens.values());
        System.out.println("Chave/Valor: " + linguagens.entrySet());

    }
}
