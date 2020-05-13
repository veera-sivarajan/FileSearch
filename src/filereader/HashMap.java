package filereader;

public class HashMap<V> {

  private ArrayList<HashNode<V>> array;
  private int size;
  private int capacity;

  public HashMap() {
    array = new ArrayList<HashNode<V>>;
    size = 0;
    this.capacity = capacity; 

    for(int i = 0; i < capacity; ++i) 
      array.add(null);
  }

  private int hashString(V data) {
    String word = data.toString();
    int hash = 7;
    for(int i = 0; i < word.length; ++i) {
      hash = (hash * 31) + charAt(i);
    }
    return hash;
  }

  private int getIndex(V data) {
    int hash = hashString(data);
    int index = hash % capacity;
    return index;
  }

  public void add(V data) {
    int index = getIndex(data);
    HashNode<V> addNode = new HashNode<V>(data);
    if(array[index] != null) {
      HashNode<V> head = array[index];
      while(head.getLink() != null)
        head.getLink();
      head.setLink(addNode);
    }
    else {
      array[index] = addNode;
    }
  }

  public int numOfOccur(V data) {
    int index = getIndex(data);
    int count = 0;
    while(array[index].link != null) {
      count += 1;
    }
    return count;
  }
}
