package generics;

import java.util.ArrayList;

public class PrintService<Generic> {
    
        /*
         * The most commonly used type parameter names are:
            E - Element (used extensively by the Java Collections Framework)
            K - Key
            N - Number
            T - Type
            V - Value
            S,U,V etc. - 2nd, 3rd, 4th types
         */
        
    ArrayList<Generic> list = new ArrayList<>();

    public void addValue(Generic value){
        list.add(value);
    }

    public Generic first(){
        return list.get(0);
    }

    public void print(){
       System.out.println(list);
    }

}
