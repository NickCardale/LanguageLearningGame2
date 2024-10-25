import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseCode {
    private static final String DB_URL = "jdbc:derby://localhost:1527/ScoresDB";
    private static final String DB_USER = "name";
    private static final String DB_PASSWORD = "pass";

    private static Connection conn = null;

    static {
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connected to the database successfully.");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        return conn;
    }

    public void insertScore(int score, int totalQuestions) {
        String sql = "INSERT INTO SCORES (LANGUAGE, SCORE, TIME) VALUES (?, ?, CURRENT_TIMESTAMP)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "Spanish");
            pstmt.setInt(2, score);
            pstmt.executeUpdate();
            System.out.println("Score inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting score: " + e.getMessage());
        }
    }
    
    public static void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }
}
