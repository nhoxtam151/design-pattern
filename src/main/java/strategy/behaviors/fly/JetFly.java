package strategy.behaviors.fly;

public class JetFly implements FlyBehavior{

  @Override
  public void fly() {
    System.out.println("Flying fast as a rocket");
  }
}
