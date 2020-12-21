import java.util.Random;
import java.util.Arrays;
public class SortTester {
  public static void main(String[] args) {

    boolean DEBUG = false;

    if (DEBUG) {
      sortTest(100,200, 20, 10, "insertion", "none");
      //sortTest(100,200, 20, 2, "insertion", "empty");
      //sortTest(100,200, 20, 10, "insertion", "sorted");
      //sortTest(100,200, 20, 10, "insertion", "reverse");
    }
  }

  public static void sortTest(int x, int y, int arrSize, int trials, String type, String sorted) {
    int[] arrSizes = new int[trials];
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

      if (sorted.equals("sorted")) {
        Arrays.sort(randomArr);
      }
      if (sorted.equals("reverse")) {
        Arrays.sort(randomArr);
        int[] newRandArr = new int[randomArr.length];
        for (int k = 0; k < randomArr.length; k++) {
          newRandArr[k] = randomArr[randomArr.length - k];
        }
        randomArr = newRandArr;
      }
      if (sorted.equals("empty")) {
        randomArr = new int[0];
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
}
