package observer;

import java.util.List;

public interface IObservable {
  void add(IObserver observer);
  void remove(IObserver observer);
  void notifyObservers();
  void setState(String message);
  String getState();
}
