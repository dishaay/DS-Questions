package searching;

public class selection_sort {
  public static void main(String args[]) {
    int arr[] = { 13, 46, 24, 52, 20, 9 };
    bSort(arr);
    printArr(arr);
  }

  public static void sel(int arr[]) {
    // selection sort means selecting the minimum and then swapping.

    for (int i = 0; i <= arr.length - 2; i++) {
      int mini = i;
      for (int j = i + 1; j <= arr.length - 1; j++) {
        if (arr[j] < arr[mini]) {
          mini = j;
        }
      }
      // swap logic.
      int temp = arr[i];
      arr[i] = arr[mini];
      arr[mini] = temp;
    }
  }

  public static void bSort(int arr[]) {

    for (int i = arr.length - 1; i >= 0; i--) {
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          // swap.
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp; // adjacent swap. isiliye loop ke andar hi aayega!
        }
      }
    }
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i <= arr.length - 1; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}