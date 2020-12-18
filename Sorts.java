import java.util.Arrays;
public class Sorts{
  public static void bubbleSort(int[] data){
    boolean sorted = false;
    int placeholder = 0;
    while (sorted == false) {
      sorted = true;
      for (int i = 0; i < data.length - 1; i++) {
        if (data[i] > data[i+1]) {
          placeholder = data[i];
          data[i] = data[i+1];
          data[i+1] = placeholder;
          sorted = false;
        }
      }
    }
  }

  public static void selectionSort(int[] data) {
    int nextMin = 2147483647; //maximum value of int
    int minPos = 0;
    for (int i = 0; i < data.length; i++) {
      for (int j = i; j < data.length; j++) {
        nextMin = Math.min(data[j],nextMin);
        if (nextMin == data[j]) {
          minPos = j;
        }
      }
      data[minPos] = data[i];
      data[i] = nextMin;
      nextMin = 2147483647;
    }
  }

  public static void insertionSort(int[] data) {
    int placeholder = 0;
    for (int i = 0; i < data.length; i++) {
      placeholder = data[i];
      for (int j = i; j > 0; j--) {
        if (data[j-1] > placeholder) {
          data[j] = data[j-1];
          data[j-1] = placeholder;
        } else {
          data[j] = placeholder;
          j = 0;
        }
      }
    }
  }
}
