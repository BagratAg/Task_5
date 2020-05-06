package car;

public class Horse implements Movable {

  private int price = 10;//task#6

  public int getPrice() {
    return price;
  }

  public class Species {

    String name = "in apples";
  }

  @Override
  public void move() {
  }

  int i = 4;

  void run() {
    System.out.println("Лошадь бегает с помощью " + i + " ног");

  }
}
