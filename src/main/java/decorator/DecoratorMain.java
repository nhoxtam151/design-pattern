package decorator;

public class DecoratorMain {

  public static void main(String[] args) {
    Cappucino cappucino = new Cappucino();
    CreamDecorator creamDecorator = new CreamDecorator(cappucino);
    MilkDecorator milkDecorator = new MilkDecorator(creamDecorator);
    System.out.println(milkDecorator.description());
    System.out.println(milkDecorator.cost());
  }
}
