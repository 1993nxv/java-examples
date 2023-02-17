import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExemploUpdate {
    
    public static void main(String[] args){

        final String usuario = "postgres";
        final String senha = "root";
        final String url = "jdbc:postgresql://localhost:5432/pessoas";
        final String sqlUpdate = "UPDATE pessoa SET nome=?, idade=? WHERE ID=?";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");
            
            PreparedStatement preparedStatement = conexao.prepareStatement(sqlUpdate);
            
            preparedStatement.setString(1, "Wellington");
            preparedStatement.setInt(2,28);
            preparedStatement.setInt(3,1);

            preparedStatement.executeUpdate();
            System.out.println("Update realizada com sucesso!");

            conexao.close();
            System.out.println("Conexão fechada.");

        }catch(Exception e){
            System.out.println("Erro." + e.getMessage());
        }
    }
}
