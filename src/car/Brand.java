package car;


public enum Brand {
  AUDI(2000, "Q4", "German"), FORD(2005, "mustang", "US");
  private int i;// дата выпуска
  private String name;//марка
  private String x;//страна пр-ва

  public int getI() {
    return i;
  }

  public String getName() {
    return name;
  }

  public String getX() {
    return x;
  }

  Brand(int i, String name, String x) {
    this.i = i;
    this.name = name;
    this.x = x;

  }
}

//System.out.println("AUDI -"+"дата создания -" + car1.getI()+  ", марка - " + car1.getName()+ ", "
//    + "страна пр-ва - " + car1.getX());
//    System.out.println("AUDI -"+"дата создания -" + car2.getI()+  ", марка - " + car2.getName()+
//    ", страна пр-ва - " + car2.getX());