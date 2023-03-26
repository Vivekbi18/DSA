import java.util.Arrays;

class BinarySearchIn2D {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int target = 9;
        
        System.out.println(Arrays.toString(search(a, target)));

    }

    static int[] search(int a[][], int target) {
        int r = a.length;
        int c = a[0].length;
        int s = 0;
        int e = (r * c) - 1;

        while (s <= e) {
            int m = (s + e) / 2;

            if (target == a[m / c][m % c]) {
                return new int[]  {m / c, m % c };
            } else if (target > a[m / c][m % c]) {
                s = m + 1;
            } else {
                e = m - 1;
            }

        }
        return new int[] { -1, -1 };
    }

}