import java.sql.*;

public class Emppp {
    public static void main(String[] args) {
        String query = "select * from emplo";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/w3schools?user=root&password=Rajasri@11");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeQuery();
            ResultSet resultset = preparedStatement.executeQuery();
            while (resultset.next()) {
                System.out.println(resultset.getInt(1) + " " + resultset.getString(2)+" "
                        +resultset.getInt(3)+" "+resultset.getInt(4));
            }
        } catch (SQLException e) {
        }
    }
}
