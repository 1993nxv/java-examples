import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExemploInsert {
    

    public static void main(String[] args){

        final String usuario = "postgres";
        final String senha = "root";
        final String url = "jdbc:postgresql://localhost:5432/pessoas";
        final String sqlInsert = "INSERT INTO pessoa(id, nome, idade) VALUES(?,?,?)";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");
            
            PreparedStatement preparedStatement = conexao.prepareStatement(sqlInsert);
            preparedStatement.setInt(1,2);
            preparedStatement.setString(2, "Bruna");
            preparedStatement.setInt(3,21);

            preparedStatement.executeUpdate();
            System.out.println("Inserção realizada com sucesso!");

            conexao.close();
            System.out.println("Conexão fechada.");

        }catch(Exception e){
            System.out.println("Erro." + e.getMessage());
        }
    }
}
