import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args){

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(8);
        numeros.add(5);
        numeros.add(8);

        System.out.println("ArrayList: " + numeros);

        LinkedHashSet<Integer> numerosLinkedHashSet = new LinkedHashSet<>(); //Pode passar a coleção na instaciaçao LinkedHashSet<>(numeros);
        numerosLinkedHashSet.addAll(numeros);
        numerosLinkedHashSet.add(4);


        System.out.println("LinkedHashSet: " + numerosLinkedHashSet);

    }
    
}
