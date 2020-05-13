package filereader;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReader {
  private String file;
  private  int wordCount;
  private HashMap<String> table;

  public FileReader(String file) {
    this.file = "/home/veera/Projects/FileSearch/src/filereader/" + file;
    this.wordCount = 0;
    table = new HashMap<String>();
  }
 
  public void getWords() throws FileNotFoundException {
    System.out.println("Entering getWords()");
    Scanner input = new Scanner(new File(file));
    while(input.hasNext()) {
      String word = input.next();
      wordCount += 1;
      System.out.println("Word: " + word);
      addToTable(word);
    }
  }
  
  public void addToTable(String word) {
    table.add(word);
  }
  
  public static void main(String[] args) throws FileNotFoundException {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter file name: ");
    String fileName = input.nextLine();
    FileReader reader = new FileReader(fileName);
    reader.getWords();
  }
}
