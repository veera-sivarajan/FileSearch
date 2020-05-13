package filereader;

import java.util.ArrayList;

public class HashMap<V> {

  private ArrayList<HashNode<V>> array;
  private int capacity;

  public HashMap() {
    array = new ArrayList<HashNode<V>>();
    this.capacity = 1000; 

    for(int i = 0; i < capacity; ++i) 
      array.add(null);
  }

  private int hashString(V data) {
    String word = data.toString();
    int hash = 7;
    for(int i = 0; i < word.length(); ++i) {
      hash = (hash * 31) + word.charAt(i);
    }
    return hash;
  }

  private int getIndex(V data) {
    int hash = hashString(data);
    int index = hash % capacity;
    return Math.abs(index);
  }

  public void add(V data) {
    int index = getIndex(data);
    System.out.println("HashMap Add Method");
    System.out.println("Index: " + index);
    HashNode<V> head = array.get(index);
    HashNode<V> toAdd = new HashNode<V>(data);
    toAdd.setLink(head);
    array.set(index, toAdd);
  }

  public int numOfOccur(V data) {
    int index = getIndex(data);
    HashNode<V> head = array.get(index);
    int count = 0;
    while(head != null) {
      count += 1;
      head = head.getLink();
    }
    return count;
  }
}
