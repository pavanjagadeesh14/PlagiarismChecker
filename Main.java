import java.io.*;
import java.util.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter path of first file: ");
        String file1Path = sc.nextLine();
        System.out.print("Enter path of second file: ");
        String file2Path = sc.nextLine();

        List<String> file1Content = FileReaderUtil.readFile(file1Path);
        List<String> file2Content = FileReaderUtil.readFile(file2Path);

        double plagiarismPercent = PlagiarismDetector.calculatePlagiarism(file1Content, file2Content);
        String verdict = plagiarismPercent > 50.0 ? "Plagiarized" : "Original";

        System.out.printf("\nPlagiarism Detected: %.2f%%\nVerdict: %s\n", plagiarismPercent, verdict);

        DatabaseManager.insertResult(new File(file1Path).getName(), new File(file2Path).getName(), plagiarismPercent,
                verdict);
    }
}
