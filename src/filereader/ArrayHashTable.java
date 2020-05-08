package filereader;

public class ArrayHashTable<V> {
  private static int size;
  private V[] array;
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
    
  public int hashCode(int key) {
    return key % capacity;
  }

  public double loadFactor() {
    loadFactor = size / capacity;
    return loadFactor;
  }

  public void add(int key, V value) {
    size += 1;
    int index = hashCode(key);
    while(array[index] != null) {
      index += 1;
    }
    System.out.println("Adding element at: " + index);
    array[index] = value;  
  }
  
  public V find(int key, V value) {
    int index = hashCode(key);
    System.out.println("Finding element at: " + index);
    return array[index];
  }
}
