public class Main {

  public static class Horse {

    public void horse_eats(String food) {
      if (food == "Grass") {
        System.out.println("Лошадь ест траву");
      } else{
        System.out.println("Лошадь такое не ест");
      }
    }

    public void horse_moves() {
      System.out.println("Лошадь ходит");
    }
  }

  public static class Tiger {

    public void tiger_eats(String food) {
      if (food == "Beef") {
        System.out.println("Тигр ест говядину");
      } else{
        System.out.println("Тигр такое не ест");
      }
    }

    public void tiger_moves() {
      System.out.println("Тигр ходит");
    }
  }

  public static class Dolphin {

    public void dolphin_eats(String food) {
      if (food == "Fish") {
        System.out.println("Дельфин ест рыбу");
      } else{
        System.out.println("Дельфин такое не ест");
      }
    }

    public void dolphin_moves() {
      System.out.println("Дельфин плывёт");
    }
  }

  public static class Eagle {

    public void eagle_eats(String food) {
      if (food == "Meat" || food == "Beef" || food == "Fish") {
        System.out.println("Орёл ест мясо");
      } else{
        System.out.println("Орёл такое не ест");
      }
    }

    public void eagle_moves() {
      System.out.println("Орёл летит");
    }
  }

  public static class Camel {

    public void camel_eats(String food) {
      if (food == "Grass") {
        System.out.println("Верблюд ест траву");
      } else{
        System.out.println("Верблюд такое не ест");
      }
    }

    public void camel_moves() {
      System.out.println("Верблюд ходит");
    }
  }
  public static void main(String[] args){
    Horse horse = new Horse();
    horse.horse_moves();
    Eagle eagle = new Eagle();
    eagle.eagle_eats("Grass");
    eagle.eagle_eats("Fish");
  }
}
