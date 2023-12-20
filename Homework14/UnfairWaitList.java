package Mirea.Homework14;

public class UnfairWaitList<T> extends WaitList<T> {

  public UnfairWaitList() {
    super();
  }

  @Override
  public void add(T element) {
    super.add(element);
  }

  public String toString(T element) {
    var str = new StringBuilder();
    for (var elemnt : Content) {
      str.append(elemnt.toString());
    }
    return str.toString();
  }

  public void remove(T element){
    super.remove(element);
  }

  public void moveToBack(T element){
    //
  }
}