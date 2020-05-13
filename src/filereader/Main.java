package filereader;

import java.util.ArrayList;

public class Main {
  ArrayList<FileReader> readerArray;

  public Main() {
    readerArray = new ArrayList<FileReader>();
  }

  public getInput() {
    Scanner input = new Scanner(System.in);
    System.out.prinln("Enter file names: ");
    String fileName = "null";
    while(fileName instanceof String) {
      readerArray.add(new FileReader(fileName));
      fileName = input.nextLine();
    } 
      
}
