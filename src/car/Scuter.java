package car;

public class Scuter implements Movable {

  private int price = 5;//task#6

  public void setPrice(int price) {
    this.price = price;
  }

  public class MadeBy {

    String name = "Japan";
  }

  void trade() {
  }

  public int getPrice() {
    return price;
  }

  @Override
  public void move() {

  }

  void RideSlow() {
    System.out.println("скутер ездит медленно");


  }
}
