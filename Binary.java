import java.util.*;
public class Main{
    public static void main(String[] args) {
        int[] arr = {10, 20, 33, 40, 50, 60, 70, 80, 90};
        int target = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Element not found!");
    }
}
