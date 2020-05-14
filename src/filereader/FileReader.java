package filereader;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReader {
  private String file;
  private HashMap<String> table;

  public FileReader(String file) {
    this.file = "/home/veera/Projects/FileSearch/test/" + file;
    table = new HashMap<String>();
  }
 
  public void getWords() throws FileNotFoundException {
    Scanner input = new Scanner(new File(file));
    while(input.hasNext()) {
      String word = input.next();
      addToTable(word);
    }
    input.close();
  }
  
  public void addToTable(String word) {
    table.add(word);
  }

  public int find(String word) {
    return table.numOfOccur(word);
  }
  
  public static void main(String[] args) throws FileNotFoundException {
    int largeCount = -1;
    String largeFile = "none";
    System.out.println("Enter search term: ");
    Scanner input = new Scanner(System.in);
    String searchTerm = input.nextLine();
    for(String file : args) {
      FileReader reader = new FileReader(file);
      reader.getWords();
      int count = reader.find(searchTerm);
      if(count > largeCount) {
        largeCount = count;
        largeFile = file;
      }
    }
    System.out.println("File: " + largeFile);
    input.close();
  }
}
