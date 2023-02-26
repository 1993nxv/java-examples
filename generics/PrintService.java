package generics;

import java.util.ArrayList;

public class PrintService<Generic> {
    
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
