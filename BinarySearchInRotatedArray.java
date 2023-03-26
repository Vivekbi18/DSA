class BinarySearchInRotatedArray {

    static int peakElement(int a[]) {
        int s = 0;
        int e = a.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;

            if (a[m] > a[m + 1] && m < a.length - 1) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        return s;
    }

    static int orderAgnosticBinarySearch(int a[], int s, int e, int target) {
        boolean isAsc = false;
        if (a[s] < a[e]) {
            isAsc = true;
        }
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (target == a[m]) {
                return m;
            }
            if (isAsc) {
                if (target < a[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (target < a[m]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }

        }
        return -1;
    }

    static int search(int a[], int target) {
        int peak = peakElement(a);

        int firstTry = orderAgnosticBinarySearch(a, 0, peak, target);

        if (firstTry != -1) {
            return firstTry;
        } else {
            return orderAgnosticBinarySearch(a, peak + 1, a.length - 1, target);
        }

    }

    public static void main(String[] args) {
        int a[] = { 1 };
        int target = 1;
        System.out.println(search(a, target));

    }
}