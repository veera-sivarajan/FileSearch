package filereader;

public class HashNode<V> {
  private V data;
  private HashNode<V> link;

  public HashNode(V value) {
    this.data = value;
  }

  public HashNode<V> getLink() {
    return link;
  }

  public void setLink(HashNode<V> link) {
    this.link = link;
  }
}
