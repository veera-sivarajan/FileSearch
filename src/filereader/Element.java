package filereader;

public class Element<V> {
  private V data;
  private Element<V> link; 
  
  public Element(V data, Element<V> link) {
    this.data = data;
    this.link = link;
  }
  
  public Element(V data) {
    this(data, null);
  }
  
  public Element<V> getLink() {
    return this.link;
  }
  
  public void setLink(Element<V> link) {
    this.link = link;
  }
  
  public V getData() {
    return this.data;
  }
  
  public void setData(V data) {
    this.data = data;
  }
}
