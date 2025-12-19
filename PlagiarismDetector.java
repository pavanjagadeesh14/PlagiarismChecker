import java.util.*;

class PlagiarismDetector {
    public static double calculatePlagiarism(List<String> file1, List<String> file2) {
        int matches = 0;
        Set<String> set1 = new HashSet<>(file1);
        for (String line : file2) {
            if (set1.contains(line)) matches++;
        }
        int total = Math.max(file1.size(), file2.size());
        return total == 0 ? 0 : (matches * 100.0) / total;
    }
}
