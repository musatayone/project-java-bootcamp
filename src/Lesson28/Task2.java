package Lesson28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task2 {
    public static void main(String[] args) {
        //Получить количество студентов в имени которых содержится буква «а».
        //Вывести текст «в группе N студентов» в консоль.

        String url = "jdbc:postgresql://localhost:5432/testdb";
        String user = "testuser";
        String password = "testpass";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            String sql = "SELECT COUNT(*) FROM students WHERE full_name LIKE '%а%'";

            ResultSet result = statement.executeQuery(sql);

            if (result.next()) {
                int count = result.getInt(1);

                System.out.println("В группе " + count + " студентов");
            }

            result.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}