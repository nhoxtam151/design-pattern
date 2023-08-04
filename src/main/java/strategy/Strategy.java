package strategy;

import strategy.behaviors.display.DisplayAsGraph;
import strategy.behaviors.display.DisplayAsText;
import strategy.behaviors.fly.JetFly;
import strategy.behaviors.fly.NoFly;
import strategy.behaviors.quack.NoQuack;
import strategy.behaviors.quack.SimpleQuack;

public class Strategy {

  public static void main(String[] args) {
    Duck rubberDuck = new Duck(new SimpleQuack(), new NoFly(), new DisplayAsText());
    rubberDuck.doSomething();
    System.out.println("=============================================");
    Duck superFastDuck = new Duck(new NoQuack(), new JetFly(), new DisplayAsGraph());
    superFastDuck.doSomething();

  }
}
