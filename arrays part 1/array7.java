public class array7 {
  public static boolean count(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int count = 0;  // reset count for each i
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      if (count >= 2) {
        return true;
      }
    }
    return false;
  }

  public static void main(String args[]) {
    int arr[] = {2, 5, 1};
    System.out.println("Is it true that the elements are repeated? " + count(arr));
  }
}
