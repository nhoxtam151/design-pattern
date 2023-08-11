package decorator;

import java.math.BigDecimal;

public class CreamDecorator extends AddOnDecorator{

  public CreamDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String description() {
    return beverage.description() + "plus cream ";
  }

  @Override
  public BigDecimal cost() {
    return beverage.cost().add(BigDecimal.valueOf(3.5));
  }
}
