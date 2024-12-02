package org.example;

import org.example.sort_files.sorts.Sort;
import org.example.sort_files.sorts.BubbleSort;
import org.example.sort_files.sorts.CollectionsSort;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = input.nextInt();
    }
    Sort sort1 = new Sort(arr, "BUBBLE");
    Sort sort2 = new Sort(arr, "COLLECTIONS");
    Sort sort3 = new Sort(arr, "QUICK");
    sort1.print();
    sort2.print();
  }
}