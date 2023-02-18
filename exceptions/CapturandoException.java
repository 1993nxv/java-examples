package exceptions;

import java.util.Scanner;

public class CapturandoException {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero: ");
        

        try {
            
            int valor = scan.nextInt();
            int resultado = 10 / valor;
            System.out.println(resultado);

        }catch(ArithmeticException exception){

            System.out.println("Erro: ArithmeticException | " + exception.getMessage());

        }catch(Exception exception){

            System.out.println("Erro: " + exception.getMessage());

        }finally{

            System.out.println("Fim!");
            scan.close();

        }

    }
}
