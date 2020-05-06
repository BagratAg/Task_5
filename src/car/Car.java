package car;

import java.util.Date;

abstract class Car implements Movable {

  // имя
  protected String name = "транспортное средство";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // цвет
  protected String color = "цвет кузова голубой";

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  // номер машины
  protected int NumCar;

  public int getNumCar() {
    return NumCar;
  }

  public void setNumCar(int numCar) {
    this.name = name;
  }

  protected Date produce = new Date(); // дата создания

  // марки в enum Brand
// состояние
  {
    int state_stop = 0;// не едет
    int state_drive = 1;//едет
    if (state_stop != state_drive) {
      System.out.println("Это транспортное средство способно передвигаться");
    } else {
      System.out.println("Это транспортное средство не способно передвигаться");
    }
  }

  abstract void drive();

  abstract void breaking();

}

