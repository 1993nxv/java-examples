import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExampleDelete {
    
    public static void main(String[] args){

        final String usuario = "postgres";
        final String senha = "root";
        final String url = "jdbc:postgresql://localhost:5432/pessoas";
        final String sqlDelete = "DELETE FROM pessoa WHERE id = ?";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");
            
            PreparedStatement preparedStatement = conexao.prepareStatement(sqlDelete);
            preparedStatement.setInt(1, 1);

            preparedStatement.executeUpdate();
           
            System.out.println("Exclusão realizada com sucesso!");

            conexao.close();
            System.out.println("Conexão fechada.");

        }catch(Exception e){
            System.out.println("Erro." + e.getMessage());
        }
    }
}
