package com.company;

import java.util.Date;

abstract class Car implements Movable{
  // имя
  protected String name;
  public String getName(){
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  // цвет
  protected String color;
  public String getColor(){
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  // номер машины
  protected int NumCar;
  public int getNumCar(){
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
  int state_drive = 10;//едет
  if (10 > 0) {
    System.out.println("машина едет");
  } else {
    System.out.println("машина стоит");
  }
}
    abstract void drive();
    abstract void breaking ();

  }

