package Animals;

import Food.*;
import Movements.Swimming;

public class Dolphin extends Animal implements Swimming {

  @Override
  public void eats(Food food) {
    if (food instanceof Fish) {
      System.out.println("Дельфин ест рыбу");
    } else {
      System.out.println("Дельфин такое не ест");
    }
  }

  @Override
  public void swims() {
    System.out.println("Дельфин плывёт");
  }
}