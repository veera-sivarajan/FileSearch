package filereader;

public class Array<T> {
  private Node<T> head;
  
  public Array() {
    head = null;
  }

  public void add(Node<T> toAdd) {
    Node<T> tail = head;
    while(tail != null)
      tail.getLink();
    tail
