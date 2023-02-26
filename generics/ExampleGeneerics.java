package generics;


public class ExampleGeneerics {
    
    public static void main(String[] args){

        PrintService<Integer> valores = new PrintService<>();
        //PrintService<String> valores = new PrintService<>();
    
        valores.addValue(1);
        valores.addValue(2);
        valores.addValue(3);
        //valores.addValue("1");
        //valores.addValue("2");
        //valores.addValue("3");
    
        System.out.println(valores.first());
        valores.print();
    }

}
