public class Sort {

  public static void bubbleSort(int[] array) {
    int n = array.length;

    for (int i = 0; i < n - 1; i++) { // Top Counter
      for (int j = 0; j < n - i - 1; j++) { // Buttom Counter
        if (array[j + 1] < array[j]) { // Check neighbour
          int key = array[j]; // Sorting algorithm
          array[j] = array[j + 1];
          array[j + 1] = key;
        }
      }
    }
    // If you want to see that the array is sorted you can print it
    // printArray(array);
  }

  public static void insertionSort(int[] array) {
    int n = array.length;

    for (int i = 1; i < n; i++) {
      int key = array[i];
      int j = i - 1;

      // Move elements of array[0..i-1] that are greater than key,
      // to one position ahead of their current position
      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j = j - 1;
      }
      array[j + 1] = key;
    }
    // If you want to see that the array is sorted you can print it
    // printArray(array);
  }

  public static void selectionSort(int[] array) {
    int n = array.length;

    for (int i = 0; i < n - 1; i++) {
      // Find the minimum element in the unsorted subarray[i..n-1]
      // and swap it with array[i]
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }

      // Swap the found minimum element with array[i]
      int temp = array[minIndex];
      array[minIndex] = array[i];
      array[i] = temp;
    }
    // If you want to see that the array is sorted you can print it
    // printArray(array);
  }

  public static void printArray(int[] array) {
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
