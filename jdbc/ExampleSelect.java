import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExampleSelect {
    
    public static void main(String[] args){

        final String usuario = "postgres";
        final String senha = "root";
        final String url = "jdbc:postgresql://localhost:5432/pessoas";
        final String sqlSelect = "SELECT * FROM pessoa";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");
            
            PreparedStatement preparedStatement = conexao.prepareStatement(sqlSelect);

            ResultSet resultado = preparedStatement.executeQuery();
            System.out.println("Busca realizada com sucesso!");

            while(resultado.next()){
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                int idade = resultado.getInt("idade");
                System.out.println("ID: " + id + " - Nome: " + nome + " - Idade: " + idade);
            }


            conexao.close();
            System.out.println("Conexão fechada.");

        }catch(Exception e){
            System.out.println("Erro." + e.getMessage());
        }
    }
    
}
