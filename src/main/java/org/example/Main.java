package org.example;

import org.example.sorts.Sort;

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