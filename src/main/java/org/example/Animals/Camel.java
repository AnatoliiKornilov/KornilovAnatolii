package Animals;

import Food.*;
import Movements.Walking;

public class Camel extends Animal implements Walking {

  @Override
  public void eats(Food food) {
    if (food instanceof Grass) {
      System.out.println("Верблюд ест траву");
    } else {
      System.out.println("Верблюд такое не ест");
    }
  }

  @Override
  public void walks() {
    System.out.println("Верблюд ходит");
  }
}