package observer;

import java.util.Objects;

public class User implements IObserver {

  private String name;
  private IObservable observable;

  public User(IObservable observable, String name) {
    this.observable = observable;
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void update() {
    System.out.println("Displaying from " + name + "'s Iphone 14 Pro Max");
    System.out.println(observable.getState());
    System.out.println();
  }

  public void sendMessage(String message) {
    message = name + " has sent a message: " + message;
    observable.setState(message);
    System.out.println();
  }
}
