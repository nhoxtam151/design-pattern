package factory_method;

public class FactoryMethodMain {

  public static void main(String[] args) throws InterruptedException {
    AsteroidFactory factory = new ConcreteAsteroidFactory();
    int playerLevel = 1;
    Asteroid asteroid;
    for (int i = 0; i < 5; i++) {
      Thread.sleep(500);
      asteroid = factory.createAsteroid(playerLevel);
      System.out.println(asteroid.toString());
    }
    Thread.sleep(1000);
    playerLevel++;
    System.out.println("Level Up!!! You are now level " + playerLevel);
    for (int i = 0; i < 5; i++) {
      Thread.sleep(500);
      asteroid = factory.createAsteroid(playerLevel);
      System.out.println(asteroid.toString());
    }

  }
}
