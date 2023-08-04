package strategy.behaviors.quack;

public class NoQuack implements QuackBehavior{

  @Override
  public void quack() {
    System.out.println("Can not quackkk!");
  }
}
