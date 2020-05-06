package store;

import car.Bus;
import car.Horse;
import car.Scuter;
import car.Tractor;
import java.util.Arrays;

public class Store<Car> {

  public int StoreMoney = 100;
  String[] products = new String[]{"bus", "tractor", "horse", "scuter"};

  //Внутри нужно создать метод printProducts() который будет распечатывать по номерам массив с
// товарами чтобы клиент мог выбрать что купить.
  public void printProducts() {
    System.out.println(Arrays.toString(products));

    Bus bus = new Bus();
    if (1 == 1) {
      System.out.println("Цена автобуса " + bus.getPrice());
    }
    //////////////////////////////////////////////////////////////////////////
    Tractor tractor = new Tractor();
    if (2 == 2) {
      System.out.println("Цена трактора " + tractor.getPrice());
    }
    /////////////////////////////////////////////////////////////////////////
    Horse horse = new Horse();
    if (3 == 3) {
      System.out.println("Цена лошади " + horse.getPrice());
    }
    ////////////////////////////////////////////////////////////////////////
    Scuter scuter = new Scuter();
    if (4 == 4) {
      System.out.println("Цена скутера " + scuter.getPrice());
    }
  }

  //Так же нужен метод purchase() который будет принимать номер товара из массива и сумму денег.
  // Внутри он должен проверять хватает ли суммы для покупки соответствующего номеру товара. Если
  // хватает тогда удаляем товар из массива, увеличиваем кассу на сумму покупки и возвращаем
  // товар. Если нет - сообщение об ошибке в консоль.

  Bus bus = new Bus();
  int x = 30;

  void purchase(int x) {
    if (bus.getPrice() > x) {
      System.out.println("Денег на покупку хватает");
    } else {
      System.out.println("Денег на покупку не хватает");
    }

    products.splice(0);
    StoreMoney = StoreMoney + x;
  }
//Так же создаем метод sell(), который принимает цену за которую мы хотим продать и транспорт
// конкретного типа. Внутри проверяет возможность продажи (не больше ли запрашиваемая сумма чем
// цена транспорта), а также может ли магазин позволить себе эту покупку. Если все хорошо тогда
// вычитаем сумму из кассы и добавляем товар в массив. Если нет - сообщение об ошибке в консоль.
//Методы get/set и остальные связанные с полем методы должны тоже принимать/возвращать такой тип.

  int price = 20;
  int busPrice = bus.getPrice();
  String name = "Bus";

  void sell(int busPrice, String name) {
    if (price < bus.getPrice()) {
      StoreMoney = StoreMoney - price;
      products.push[5];
    } else {
      System.out.println("недостаточно денег");
    }


  }
}






