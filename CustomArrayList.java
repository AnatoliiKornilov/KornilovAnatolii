public class CustomArrayList<T> {

  private Object[] arr = new Object[1000];
  private Integer capacity = 0;

  public void add(T value){
    if (arr.length - capacity > 1){
      arr[capacity] = value;
      ++capacity;
    } else{
      Object[] big_arr = new Object[2 * capacity];
      for (int i = 0; i < arr.length; i++) {
        big_arr[i] = arr[i];
      }
      big_arr[capacity] = value;
      ++capacity;
      arr = big_arr.clone();
    }
  }

  public void get(int ind){
    if (0 <= ind && ind < capacity) {
      System.out.println(arr[ind]);
    } else{
      System.out.println("Index is incorrect");
    }
  }

  public void remove(int ind){
    if (0 <= ind && ind < capacity) {
      Object[] new_arr  = new Object[arr.length];
      for (int i = 0; i < arr.length; i++) {
        if (i < ind){
          new_arr[i] = arr[i];
        } else if (i > ind){
          new_arr[i - 1] = arr[i];
        }
      }
      --capacity;
      arr = new_arr.clone();
    } else{
      System.out.println("Index is incorrect");
    }
  }

  public void print() {
    for (int i = 0; i < capacity; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args){
    CustomArrayList<Integer> a = new CustomArrayList<Integer>();
    a.add(1);
    a.print();
    a.add(2);
    a.add(1);
    a.add(4);
    a.get(1);
    a.print();
    a.remove(3);
    a.print();
  }
}
