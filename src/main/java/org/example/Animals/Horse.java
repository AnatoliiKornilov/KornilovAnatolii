package Animals;

import Food.*;
import Movements.Walking;

public class Horse extends Animal implements Walking {

  @Override
  public void eats(Food food) {
    if (food instanceof Grass) {
      System.out.println("Лошадь ест траву");
    } else {
      System.out.println("Лошадь такое не ест");
    }
  }

  @Override
  public void walks() {
    System.out.println("Лошадь ходит");
  }
}
