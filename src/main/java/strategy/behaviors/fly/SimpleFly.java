package strategy.behaviors.fly;

public class SimpleFly implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("Flyinggg in simple way");
  }
}
