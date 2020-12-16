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
}
