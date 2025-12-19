import java.io.*;
import java.util.*;

class FileReaderUtil {
    public static List<String> readFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim().replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
            if (!line.isEmpty()) lines.add(line);
        }
        br.close();
        return lines;
    }
}
