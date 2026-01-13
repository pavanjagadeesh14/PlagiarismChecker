# File Similarity Analyzer (Java)

A Java-based File Similarity Analyzer that compares two text files using the **Jaccard Similarity algorithm** to calculate similarity percentage.

The project demonstrates core Java programming, data structures, file handling, algorithmic thinking, and database integration using JDBC.

---

## 🚀 Features

- Compares two text files for similarity percentage
- Uses **Jaccard Similarity Algorithm** for comparison
- Calculates similarity percentage
- Displays verdict based on similarity threshold
- Stores comparison results in a MySQL database
- Maintains history of previous files checks
- Simple console-based execution

---

## 🧠 Algorithm Used

### Jaccard Similarity Algorithm

Jaccard Similarity measures similarity between two sets using the formula : J(A, B) = |A ∩ B| / |A ∪ B|


In this project:
- Text files are tokenized into sets of words
- Intersection and union of word sets are calculated
- Similarity percentage is derived from the Jaccard score

This approach is efficient and commonly used in File Similarity Analyzer.

---

## 🛠 Tech Stack

- **Language:** Java  
- **Algorithm:** Jaccard Similarity  
- **Concepts:** OOP, Data Structures  
- **Database:** MySQL  
- **Connectivity:** JDBC  
- **File Handling:** Java I/O  
- **Version Control:** Git & GitHub  

---

## 📂 Project Structure

PlagiarismChecker/
├── Main.java
├── PlagiarismDetector.java
├── FileReaderUtil.java
├── DatabaseManager.java
├── README.md


---

## ⚙️ How the Application Works

1. User provides paths of two text files
2. Files are read and processed into word sets
3. Jaccard Similarity is applied to calculate similarity
4. Plagiarism percentage and verdict are displayed
5. Results are stored in the database for history tracking

---

## 📊 Output Example

Plagiarism Detected: 22.22%
Verdict: Original


---

## 📈 Future Enhancements

- Display comparison history directly in console
- Improve tokenization and normalization
- Add support for multiple file comparisons
- GUI or web-based interface
- Advanced plagiarism detection techniques

---

## 👤 Author

**Pavan Jagadeesh Rajarapu**  
GitHub: https://github.com/pavanjagadeesh14

---

## ⭐ Project Highlights

- Implements a real File Similarity Analyzer.
- Demonstrates strong Java and algorithm fundamentals
- Uses database to persist comparison history
- Clean, readable, and maintainable code structure
