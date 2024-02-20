public class BinarySearchRecursive {
    public static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // If target found at mid
            } else if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, right); // Searches in the right half
            } else {
                return binarySearch(arr, target, left, mid - 1); // Searches in the left half
            }
        }
        return -1; // If target not found
    }

    public static void main(String[] args) {
        //The range of indexes
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        //Selected element
        int target = 9;
        int index = binarySearch(arr, target);
        //Output
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
