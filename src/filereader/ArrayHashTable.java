package filereader;

public class ArrayHashTable<V> {
  private static int size;
  private static V[] array;
  private static int capacity;
  private double loadFactor; 

  public ArrayHashTable(int capacity) {
    this.capacity = capacity;
    array = (V[]) new Object[capacity];
    loadFactor = 0.0;
  }
  
  public static int getSize() {
    return size;
  }
  
  public static int getCapacity() {
    return capacity;
  }

  public static boolean isEmpty() {
    return size == 0;
  }
    
  public static int hashString(V word) {
    int hash = 7;
    for(char c : word) {
      hash = (hash * 31) + c;
    }
    return hash;
  }

  public static int getIndex(V word) {
    return hashString(word) % size;
  }

  public double loadFactor() {
    loadFactor = size / capacity;
    return loadFactor;
  }

  public void add(V value) {
    size += 1;
    int index = getIndex(value); 
    while(array[index] != null) {
      index += 1;
    }
    System.out.println("Adding element at: " + index);
    array[index] = value;  
  }
  
  public V find(int key, V value) {
    int index = stringHash(key);
    System.out.println("Finding element at: " + index);
    return array[index];
  }
}
