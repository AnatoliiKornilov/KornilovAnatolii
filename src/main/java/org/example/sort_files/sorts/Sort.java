package org.example.sort_files.sorts;

import java.util.ArrayList;

public class Sort {

  public ArrayList<Integer> ans;

  public Sort(int[] arr, String typeSort) {
    if (typeSort.compareTo("BUBBLE") == 0) {
      ans =  new BubbleSort(arr).sortedArr;
    } else if (typeSort.compareTo("COLLECTIONS") == 0) {
      ans = new CollectionsSort(arr).sortedArr;
    } else {
      System.out.println("Такого типа сортировки нет");
    }
  }
  public void print() {
    for (int i = 0; i < ans.size(); i++) {
      System.out.print(ans.get(i) + " ");
    }
    System.out.println();
  }
}