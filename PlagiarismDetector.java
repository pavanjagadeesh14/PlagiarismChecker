import java.util.*;

class PlagiarismDetector {
    public static double calculatePlagiarism(List<String> file1, List<String> file2) {
        // Convert both lists to sets to automatically remove duplicate lines
        Set<String> set1 = new HashSet<>(file1);
        Set<String> set2 = new HashSet<>(file2);

        // Edge case: if both files are completely empty, they are identical
        if (set1.isEmpty() && set2.isEmpty()) return 100.0;

        // Count true unique matches (Intersection)
        int matches = 0;
        for (String line : set2) {
            if (set1.contains(line)) {
                matches++;
            }
        }

        // Formula for True Union size: Size(A) + Size(B) - Intersection
        int unionSize = set1.size() + set2.size() - matches;

        // Calculate and return Jaccard percentage (0.0 to 100.0)
        return (matches * 100.0) / unionSize;
    }
}
