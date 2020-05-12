package filereader;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReader {
  private String file;
  private static int wordCount;
  private static ArrayHashTable<String> table; 

  public FileReader(String file) {
    this.file = "/home/veera/Projects/FileSearch/src/filereader/" + file;
    this.wordCount = 0;
    table = new ArrayHashTable<String>(100);
  }
 
  public void getWords() throws FileNotFoundException {
    Scanner input = new Scanner(new File(file));
    while(input.hasNext()) {
      String word = input.next();
      wordCount += 1;
      addToTable(word);
    }
  }
  
  public static void addToTable(String word) {
    table.add(1, word);
  }
  
  public static void main(String[] args) throws FileNotFoundException {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three file name: ");
    String file1 = input.next();
    String file2 = input.next();
    String file3 = input.next();
    System.out.println("Enter search term: ");
    String searchTerm = input.next();
    FileReader read1 = new FileReader(file1);
    FileReader read2 = new FileReader(file2);
    FileReader read3 = new FileReader(file3);
    read1.getWords();
    read2.getWords();
    read3.getWords();
    System.out.println("Word count: " + wordCount);
  } 
}
