package Animals;

import Food.*;
import Movements.Walking;

public class Tiger extends Animal implements Walking {

  @Override
  public void eats(Food food) {
    if (food instanceof Beef) {
      System.out.println("Тигр ест говядину");
    } else {
      System.out.println("Тигр такое не ест");
    }
  }

  @Override
  public void walks() {
    System.out.println("Тигр ходит");
  }
}