package filereader;

public class Node<T> {
  private T data;
  private Node<T> link;

  public Node(T data) {
    this.data = data;
    this.link = null;
  }

  public void setLink(Node<T> link) {
    this.link = link;
  }

  public Node<T> getLink() {
    return link;
  }
}
