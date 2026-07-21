package Lesson28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task3 {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String user = "testuser";
        String password = "testpass";

        try {

            Connection connection =
                    DriverManager.getConnection(url, user, password);

            Statement statement =
                    connection.createStatement();

            String sql =
                    "SELECT id, full_name, group_id FROM students";

            ResultSet result =
                    statement.executeQuery(sql);

            while (result.next()) {

                int id = result.getInt("id");
                String name = result.getString("full_name");
                int groupId = result.getInt("group_id");

                System.out.println(
                        id + " | " +
                                name + " | " +
                                groupId
                );
            }

            result.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}