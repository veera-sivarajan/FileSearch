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
    FileReader read = new FileReader("test.txt");
    read.getWords();
    System.out.println("Word count: " + wordCount);
  } 
}
