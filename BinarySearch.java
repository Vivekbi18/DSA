import java.util.*;

class BinarySearch {

    // this is order agnito binary search

    static int search(int a[], int target) {
        int n = a.length;
        int start = 0;
        int end = n - 1;
        int mid = 0;
        boolean isAsc = a[0] < a[n - 1];
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (a[mid] == target) {
                return mid;
            }

            if (isAsc) {

                if (target < a[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {

                if (target > a[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

}

class Main {
    public static void main(String[] args) {
        int a[] = {99,9,8,7,6,5,4,3,2,1,0};
        System.out.println(BinarySearch.search(a, 9));
    };
}