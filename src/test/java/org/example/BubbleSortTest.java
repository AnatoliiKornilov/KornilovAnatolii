package org.example;

import java.util.ArrayList;
import org.example.sorts.Sort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
  @Test
  void sort() throws Exception {
    int[] arr1 = new int[]{1, 9, 5, 7, 2, 10, 8, 4, 3, 6};
    int[] arr2 = new int[]{1, 1, 1};
    int[] arr3 = new int[]{2};
    int[] arr4 = new int[]{};
    ArrayList<Integer> arr1_ans = new ArrayList<>();
    ArrayList<Integer> arr2_ans = new ArrayList<>();
    ArrayList<Integer> arr3_ans = new ArrayList<>();
    ArrayList<Integer> arr4_ans = new ArrayList<>();
    int[] arr1_sorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i = 0; i < arr1_sorted.length; i++) {
      arr1_ans.add(arr1_sorted[i]);
    }
    for (int i = 0; i < arr2.length; i++) {
      arr2_ans.add(arr2[i]);
    }
    for (int i = 0; i < arr3.length; i++) {
      arr3_ans.add(arr3[i]);
    }
    Sort sort1 = new Sort(arr1, "BUBBLE");
    Sort sort2 = new Sort(arr2, "BUBBLE");
    Sort sort3 = new Sort(arr3, "BUBBLE");
    Sort sort4 = new Sort(arr4, "BUBBLE");
    assertEquals(arr1_ans, sort1.ans);
    assertEquals(arr2_ans, sort2.ans);
    assertEquals(arr3_ans, sort3.ans);
    assertEquals(arr4_ans, sort4.ans);
  }
}