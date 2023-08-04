package observer;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IObservable{

  private String message;
  List<IObserver> observers;

  public ChatRoom() {
    observers = new ArrayList<>();
  }

  @Override
  public void add(IObserver observer) {
    observers.add(observer);
    setState(observer.getName() + " has joined chat room");
  }

  @Override
  public void remove(IObserver observer) {
    observers.remove(observer);
    setState(observer.getName() + " has left chat room");
  }

  @Override
  public void notifyObservers() {
    for(IObserver observer : observers) {
      observer.update();
    }
  }

  @Override
  public void setState(String message) {
    this.message = message;
    notifyObservers();
  }

  @Override
  public String getState() {
    return message;
  }
}
