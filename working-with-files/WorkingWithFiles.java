import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WorkingWithFiles {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo com seu path: \\");
        String nameFile = scan.nextLine();

        File objectFile = new File(nameFile);

        if(objectFile.exists()){
            if(objectFile.isFile()){
                System.out.println("Nome do arquivo: " + objectFile.getName());
                System.out.println("Local do arquivo: " + objectFile.getPath());
                System.out.println("Tamanho do arquivo: " + objectFile.length());
            }
        }else{
            System.out.println("Arquivo não encontrado.");
        }

        fileWriter(nameFile, "Teste escrita arquivo! 2");
        fileReader(objectFile);

        scan.close();
    }

    public static void fileWriter(String nameFile, String conteudo){

        try {
            FileWriter fileWriter = new FileWriter(nameFile);
            PrintWriter writer = new PrintWriter(fileWriter);

            writer.println(conteudo);

            fileWriter.close();
        } catch (IOException e) {
            e.getMessage();
        }

    }
    
    public static void fileReader(File objectFile){
                
                //Reader File
                System.out.println("Conteudo do Aqruivo: " + objectFile.getName());

                try {
                    FileReader fileReader = new FileReader(objectFile);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
        
                    String lines = bufferedReader.readLine();
                    while (lines != null){
                        System.out.println(lines);
                        lines = bufferedReader.readLine();
                    }
                    fileReader.close();
        
                }catch (IOException e){
                    System.out.println("Erro ao ler o arquivo." + e.getMessage());
                }
    }
    

}
