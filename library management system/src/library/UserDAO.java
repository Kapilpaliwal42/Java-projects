package library;

import java.sql.*;

public class UserDAO {
    public static void addUser(String name) {
        String sql = "INSERT INTO users (name) VALUES (?)";
        try (Connection conn = Database.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            System.out.println("User added.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
