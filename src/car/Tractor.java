package car;


public class Tractor extends Car implements Movable {
  private int price = 15;//task#6

  public int getPrice() {
    return price;
  }

  public class Plow {

    int x = 1;
  }

  void turn_earth () {
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

  String clearfield(String name) {
    String brand = "Трактор работает летом" + name;
    System.out.println(brand);
    return (name);
  }

  int harvest_tn = 20;
  int plane_tn = 20;

  public void HarvestCrop() {
    if (harvest_tn == plane_tn)
      System.out.println("План достигнут");
    else {
      System.out.println("План не достигнут");
    }
  }
}


