package Animals;

import Food.*;
import Movements.Flying;

public class Eagle extends Animal implements Flying {

  @Override
  public void eats(Food food) {
    if (food instanceof Beef) {
      System.out.println("Орёл ест говядину");
    } else if (food instanceof Fish) {
      System.out.println("Орёл ест рыбу");
    } else if (food instanceof Meat) {
      System.out.println("Орёл ест мясо");
    } else {
      System.out.println("Орёл такое не ест");
    }
  }

  @Override
  public void flies() {
    System.out.println("Орёл летит");
  }
}