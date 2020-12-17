import java.util.Random;
import java.util.Arrays;
public class SortTester {
  public static void main(String[] args) {

    boolean DEBUG = true;

    if (DEBUG) {
      //bubbleSortTest(100,200, 100);

      int[] empty = {};
      int[] s1 = {1, 5, 6, 7, 10, 11, 12};
      int[] s2 = {1, 14, 14252, 112312321, 122321812};
      int[] r1 = {12849, 19, 12, 11, 7, 5, 4, 2};
      int[] r2 = {1010101, 1119, 112, 111, 17, 15, 4, 2, 0};
      int[][] tests = {empty, s1, s2, r1, r2};

      for (int i = 0; i < tests.length; i++) {
        System.out.println("unsorted:" + Arrays.toString(tests[i]));
        Sorts.bubbleSort(tests[i]);
        System.out.println("sorted:" + Arrays.toString(tests[i]));
      }
    }
  }

  public static void bubbleSortTest(int x, int y, int arrSize) {
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
      Sorts.bubbleSort(randomArr);
      System.out.println("sorted:" + Arrays.toString(randomArr));
      System.out.println();
    }
  }

  public static void bubbleSortTest(int[] arr) {
    System.out.println(Arrays.toString(arr));
    Sorts.bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
