import java.sql.Connection;
import java.sql.DriverManager;

public class ExemploJdbc {
    
    public static void main(String[] args){

        final String usuario = "postgres";
        final String senha = "root";
        final String url = "jdbc:postgresql://localhost:5432/pessoas";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println(conexao.getSchema());
            System.out.println("Conexão realizada com sucesso!");
            conexao.close();
            System.out.println("Conexão fechada.");
        }catch(Exception e){
            System.out.println("Erro na conexao com o DB." + e.getMessage());
        }
    }

}
