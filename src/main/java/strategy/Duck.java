package strategy;

import strategy.behaviors.display.DisplayBehavior;
import strategy.behaviors.fly.FlyBehavior;
import strategy.behaviors.quack.QuackBehavior;

public class Duck {
  private QuackBehavior quackBehavior;
  private FlyBehavior flyBehavior;
  private DisplayBehavior displayBehavior;

  public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior,
      DisplayBehavior displayBehavior) {
    this.quackBehavior = quackBehavior;
    this.flyBehavior = flyBehavior;
    this.displayBehavior = displayBehavior;
  }

  public QuackBehavior getQuackBehavior() {
    return quackBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public FlyBehavior getFlyBehavior() {
    return flyBehavior;
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public DisplayBehavior getDisplayBehavior() {
    return displayBehavior;
  }

  public void setDisplayBehavior(DisplayBehavior displayBehavior) {
    this.displayBehavior = displayBehavior;
  }

  public void doSomething() {
    quackBehavior.quack();
    displayBehavior.display();
    flyBehavior.fly();
  }

}
