package org.example.sort_files.sorts;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsSort {

  public ArrayList<Integer> sortedArr = new ArrayList<>();

  public CollectionsSort(int[] arr) {
    int[] arr2 = arr.clone();
    sort(arr2);
  }

  private void sort(int[] arr2) {
    Arrays.sort(arr2);
    for (int i = 0; i < arr2.length; i++) {
      sortedArr.add(arr2[i]);
    }
  }
}