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

  public int find(String word) {
    return table.numOfOccur(word);
  }
  
  /* public static void main(String[] args) throws FileNotFoundException {
    System.out.println("Entering main()");
    Scanner input = new Scanner(System.in);
    System.out.println("Enter file1 name: ");
    String fileName = input.nextLine();
    FileReader reader = new FileReader(fileName);
    System.out.println("Enter file1 name: ");
    System.out.println("Enter file1 name: ");
    String fileName = input.nextLine();
    String fileName = input.nextLine();
    reader.getWords();
    System.out.println("Enter search term: ");
    String searchTerm = input.nextLine();
    int count = reader.find(searchTerm);
    System.out.println("Count: " + count);
  } */
}
