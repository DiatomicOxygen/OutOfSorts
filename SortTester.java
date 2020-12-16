import java.util.Random;
import java.util.Arrays;
public class SortTester {
  public static void main(String[] args) {

    boolean DEBUG = true;

    if (DEBUG) {
      bubbleSortTest(100,200, 100);
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

}
