package factory_method;

public class Asteroid {

  @Override
  public String toString() {
    return "Asteroid{" +
        "size=" + size +
        ", velocity=" + velocity +
        '}';
  }

  private double size;
  private double velocity;

  public double getSize() {
    return size;
  }

  public double getVelocity() {
    return velocity;
  }

  public void setSize(double size) {
    this.size = size;
  }

  public void setVelocity(double velocity) {
    this.velocity = velocity;
  }
}
