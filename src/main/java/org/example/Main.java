package org.example;

import Food.*;
import Animals.*;

public class Main {

  public static void main(String[] args) {
    Eagle eagle = new Eagle();
    eagle.eats(new Grass());
    eagle.eats(new Meat());
    eagle.flies();
    Camel camel = new Camel();
    camel.eats(new Grass());
    camel.eats(new Meat());
    camel.walks();
    Dolphin dolphin = new Dolphin();
    dolphin.eats(new Grass());
    dolphin.eats(new Fish());
    dolphin.swims();
    Horse horse = new Horse();
    horse.eats(new Grass());
    horse.eats(new Meat());
    horse.walks();
    Tiger tiger = new Tiger();
    tiger.eats(new Grass());
    tiger.eats(new Meat());
    tiger.walks();
  }
}