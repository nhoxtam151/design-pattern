package decorator;

import java.math.BigDecimal;

public class MilkDecorator extends AddOnDecorator {

  public MilkDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String description() {
    return beverage.description() + "plus milk ";
  }

  @Override
  public BigDecimal cost() {
    return beverage.cost().add(BigDecimal.valueOf(2));
  }
}
