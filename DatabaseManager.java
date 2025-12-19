import java.sql.*;

class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/plagiarism_db";
    private static final String USER = "root"; // change if different
    private static final String PASSWORD = "oracle"; // change if different

    public static void insertResult(String file1, String file2, double percent, String verdict) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO plagiarism_results (file1_name, file2_name, match_percent, verdict, timestamp) VALUES (?, ?, ?, ?, NOW())";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, file1);
            stmt.setString(2, file2);
            stmt.setDouble(3, percent);
            stmt.setString(4, verdict);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
