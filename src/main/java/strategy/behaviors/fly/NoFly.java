package strategy.behaviors.fly;

public class NoFly implements FlyBehavior{

  @Override
  public void fly() {
    System.out.println("Can not flyyyyy!");
  }
}
