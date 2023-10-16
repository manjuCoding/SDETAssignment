package exceptionAssign;

public class Box<T> {
  private T item;
  public void addItem(T item){
  
  this.item=item;
  }
  public getItem(){
  return item;
  }
}
