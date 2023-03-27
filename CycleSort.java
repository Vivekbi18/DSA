import java.util.Arrays;

class CycleSort {

    static void cycleSort(int a[]) {
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[correct] != a[i]) {

                int temp = a[i];
                a[i] = a[correct];
                a[correct] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 3, 2, 4, 5, 6, 8, 9, 7, 1,0};
        cycleSort(a);
        System.out.println(Arrays.toString(a));
    }
}