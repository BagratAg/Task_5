package car;

public class Bus extends Car implements Movable {


  private int price = 20;//task#6

  public int getPrice() {
    return price;
  }

  public class Wheels {

    int passengerPlace = 25;
  }

  void transporting() {
  }


  @Override
  void drive() {

  }

  @Override
  void breaking() {

  }

  @Override
  public void move() {
  }

  void TakePassengers() {
    System.out.println("Автобус перевозит пассажиров");
    super.getColor();
    int i = 5;
    while (i <= 5) {
      System.out.println("автобус не полный");
      i++;
    }

    System.out.println(super.getColor());
    System.out.println(super.getName());

  }
}
