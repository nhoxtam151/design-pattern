package decorator;

import java.math.BigDecimal;

public class Espresso extends Beverage{

  @Override
  public String description() {
    return "Espresso ";
  }

  @Override
  public BigDecimal cost() {
    return BigDecimal.valueOf(2.5);
  }
}
