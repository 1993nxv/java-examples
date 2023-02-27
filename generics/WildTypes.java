package generics;

import java.util.Arrays;
import java.util.List;

public class WildTypes{

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        //Porém não é possível adicionar dados a uma coleção de tipo curinga 

        List<String> myStrings = Arrays.asList("Del", "Bru", "San");
        printList(myStrings);

        //Porém não é possível adicionar dados a uma coleção de tipo curinga 
        //List<?> list = new ArrayList<Integer>();
        //list.add(3); // erro de compilação
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
 
    /*
    O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
    public static void main(String[] args){
        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers; // erro de compilação
    }
    */
}   



