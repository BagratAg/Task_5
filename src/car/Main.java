package car;

public class Main {

  public static void main(String[] args) {
    Brand car1 = Brand.AUDI;
    Brand car2 = Brand.FORD;

    Bus bus = new Bus();
    bus.TakePassengers();

    Tractor tractor = new Tractor();
    tractor.clearfield(" и собирает урожай");
    tractor.HarvestCrop();

    Scuter scuter = new Scuter();
    scuter.RideSlow();

    Horse horse = new Horse();
    horse.run();

  }
}




