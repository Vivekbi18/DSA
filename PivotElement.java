class PivotElement {
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
            if (a[s] >= a[m]) {
                e = m-1;
            } else {
                s = m + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 4,5,6,7,0,1,2 };
        System.out.println(findPivot(a));
    }
}