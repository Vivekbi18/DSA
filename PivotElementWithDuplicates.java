class PivotElementWithDuplicates {
    static int findPivot(int a[]) {

        int s = 0;
        int e = a.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (a[m] > a[m + 1] && m < e) {
                return m;
            }
            if (a[m] < a[m - 1] && m > s) {
                return m - 1;
            }
            if (a[m] == a[s] && a[m] == a[e]) {

                if (a[s] > a[s + 1]) {
                    return s;
                }
                s++;
                if (a[e] < a[e - 1]) {
                    return e - 1;
                }
                e--;
            } else if (a[s] < a[m] || a[s] == a[m] && a[e] < a[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 1 };
        System.out.println(findPivot(a));
    }
}