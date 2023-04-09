public class BinarySearch {
  public BinarySearch(int[] sortedArray, int target) {
    int left = 0;
    int right = sortedArray.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (sortedArray[mid] == target) {
        System.out.println("Found at value " + mid);
        break;
      }
      // If target is greater than mid, search in the right subarray
      if (sortedArray[mid] < target) {
        left = mid + 1;
      }
      // Else, search in the left subarray
      if (sortedArray[mid] > target) {
        right = mid - 1;
      }
    }
  }
}
