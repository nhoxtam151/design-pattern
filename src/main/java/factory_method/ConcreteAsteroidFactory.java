package factory_method;

public class ConcreteAsteroidFactory implements AsteroidFactory {

  @Override
  public Asteroid createAsteroid(int playerLevel) {
    Asteroid asteroid = new Asteroid();
    asteroid.setSize(getRandomNumber(0, playerLevel));
    asteroid.setVelocity(playerLevel * 0.5d);
    return asteroid;
  }

  public double getRandomNumber(int min, int level) {
    return ((Math.random() * (level - min)) + min);
  }
}
