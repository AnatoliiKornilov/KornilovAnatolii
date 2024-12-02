package org.example.sorts;

import java.util.ArrayList;

public class BubbleSort {

  public ArrayList<Integer> sortedArr = new ArrayList<>();

  public BubbleSort(int[] arr) {
    int[] newArr = arr.clone();
    for (int i = 0; i < newArr.length; i++) {
      sortedArr.add(newArr[i]);
    }
    bubbleSort();
  }

  private void bubbleSort() {
    if (sortedArr.size() <= 1) {
      return;
    }
    for (int i = 0; i < sortedArr.size() - 1; i++) {
      for (int j = i + 1; j < sortedArr.size(); j++) {
        if (sortedArr.get(i) > sortedArr.get(j)) {
          int tmp = sortedArr.get(i);
          sortedArr.set(i, sortedArr.get(j));
          sortedArr.set(j, tmp);
        }
      }
    }
    return;
  }
}