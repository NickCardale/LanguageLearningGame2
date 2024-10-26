package languagelearninggame2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
// chatgpt helped debug this page
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
    }// ChatGPT helped create error handling messages here

    public static Connection getConnection() {
        return conn;
    }

    public void insertScore(String language, int score, int totalQuestions) {
    String sql = "INSERT INTO SCORES (LANGUAGE, SCORE, TIME) VALUES (?, ?, CURRENT_TIMESTAMP)";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, language);
        pstmt.setInt(2, score);
        pstmt.executeUpdate();
        System.out.println("Score inserted successfully.");
    } catch (SQLException e) {
        System.out.println("Error inserting score: " + e.getMessage());
    }// ChatGPT helped create error handling messages here
}
    
      public List<String> getAllScores() {
    List<String> scores = new ArrayList<>();
    String sql = "SELECT SCORE, LANGUAGE, TIME FROM SCORES ORDER BY TIME DESC"; 

    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            int score = rs.getInt("SCORE");
            
            
            String lang = rs.getString("LANGUAGE");
            String time = rs.getString("TIME");
            scores.add("Language: " + lang + ", Score: " + score + ", Time: " + time);
        }
    } catch (SQLException e) {
        System.out.println("Error retrieving scores: " + e.getMessage());
    }// ChatGPT helped create error handling messages here
    // ChatGPT was used to help structure the "getAllScores" logic

    return scores;
}
    
    public static void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }// ChatGPT helped create error handling messages here
    }
}
