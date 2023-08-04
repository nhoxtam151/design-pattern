package observer;

public class ObserverApp {

  public static void main(String[] args) {
    IObservable observable = new ChatRoom();
    User observer = new User(observable, "Johnny");
    User observer2 = new User(observable, "Duc ku");
    observable.add(observer);
    observable.add(observer2);

    observer.sendMessage("hello");
    observer2.sendMessage("ni hao");
    observer2.sendMessage("FBI open uppppp!!!");
    observable.remove(observer2);
    observer.sendMessage("ohhh... see yah");
  }
}
