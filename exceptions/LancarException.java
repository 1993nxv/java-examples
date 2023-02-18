package exceptions;

import java.util.Scanner;

public class LancarException {
    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um Dividendo: ");
        Integer dividendo = scan.nextInt();
        System.out.println("Entre com um Divisor: ");
        Integer divisor = scan.nextInt();
        

        try {
            
            fazDivisao(dividendo, divisor);

        }catch(DivisaoPorZeroException exception){

            System.out.println("Erro: " + exception.getMessage());

        }finally{

            System.out.println("Fim!");
            scan.close();

        }

    }
    private static void fazDivisao(Integer dividendo, Integer divisor) throws Exception{

        if (divisor <= 0){
            throw new DivisaoPorZeroException();
        }
    
        Integer resultado = dividendo / divisor;
        System.out.println("Resultado: " + resultado);
    }

}


