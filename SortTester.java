import java.util.Random;
import java.util.Arrays;
public class SortTester {
  public static void main(String[] args) {

    boolean DEBUG = false;

    if (DEBUG) {
      sortTest(100,200, 20, "insertion");

      int[] empty = {};
      int[] s1 = {1, 5, 6, 7, 10, 11, 12};
      int[] s2 = {1, 14, 14252, 112312321, 122321812};
      int[] r1 = {12849, 19, 12, 11, 7, 5, 4, 2};
      int[] r2 = {1010101, 1119, 112, 111, 17, 15, 4, 2, 0};
      int[][] tests = {empty, s1, s2, r1, r2};

      for (int i = 0; i < tests.length; i++) {
        sortTest(tests[i], "insertion");
      }
    }
  }

  public static void sortTest(int x, int y, int arrSize, String type) {
    int[] arrSizes = new int[10];
    Random rng = new Random(x);
    Random rng2 = new Random(y);
    for (int i = 0; i < 10; i++) {
      arrSizes[i] = Math.abs(rng.nextInt()) % arrSize;
    }

    int[] randomArr;
    for (int i = 0; i < 10; i++) {
      randomArr = new int[arrSizes[i]];
      for (int j = 0; j < randomArr.length; j++) {
        randomArr[j] = rng2.nextInt() % 100;
      }
      System.out.println("unsorted:" + Arrays.toString(randomArr));
      if (type.equals("bubble")) {
        Sorts.bubbleSort(randomArr);
      }
      if (type.equals("selection")) {
        Sorts.selectionSort(randomArr);
      }
      if (type.equals("insertion")) {
        Sorts.insertionSort(randomArr);
      }
      System.out.println("sorted:" + Arrays.toString(randomArr));
      System.out.println();
    }
  }

  public static void sortTest(int[] arr, String type) {
    System.out.println("unsorted:" + Arrays.toString(arr));
    if (type.equals("bubble")) {
      Sorts.bubbleSort(arr);
    }
    if (type.equals("selection")) {
      Sorts.selectionSort(arr);
    }
    if (type.equals("insertion")) {
      Sorts.insertionSort(arr);
    }
    System.out.println("sorted:" + Arrays.toString(arr));
  }
}
