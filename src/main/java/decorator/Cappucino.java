package decorator;

import java.math.BigDecimal;

public class Cappucino extends Beverage{

  @Override
  public String description() {
    return "Cappucino ";
  }

  @Override
  public BigDecimal cost() {
    return BigDecimal.valueOf(3.5);
  }
}
