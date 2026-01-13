import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseManager {

    private static final String URL =

            "jdbc:mysql://localhost:3306/plagiarismdb?useSSL=false&allowPublicKeyRetrieval=true";

    private static final String USER = "root";
    private static final String PASSWORD = "NewStrongPassword@123";

    // INSERT RESULT
    public static void insertResult(String file1, String file2,
            double percentage, String verdict) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            String sql = "INSERT INTO plagiarism_results (file1_name, file2_name, plagiarism_percentage, verdict) " +
                    "VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, file1);
            ps.setString(2, file2);
            ps.setDouble(3, percentage);
            ps.setString(4, verdict);

            ps.executeUpdate();
            con.close();

            System.out.println("Result saved to database.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // FETCH HISTORY
    public static void showHistory() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            String sql = "SELECT * FROM plagiarism_results ORDER BY compared_at DESC";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            System.out.println("\n---- Previous Comparisons ----");

            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("id") +
                                " | File1: " + rs.getString("file1_name") +
                                " | File2: " + rs.getString("file2_name") +
                                " | Similarity: " + rs.getDouble("plagiarism_percentage") + "%" +
                                " | Verdict: " + rs.getString("verdict") +
                                " | Time: " + rs.getTimestamp("compared_at"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
