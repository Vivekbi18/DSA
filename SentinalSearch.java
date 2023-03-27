class SentinalSearch {

    static int search(int a[][], int key) {

        int i = 0;
        int last = a[a.length - 1];
        a[a.length - 1] = key;
        while (a[i] != key) {
            while (a[i] != key) {
                i++;
            }
        }
        a[a.length - 1] = last;
        if (i < a.length - 1 || a[a.length - 1] == key) {
            return 1;
        }
        return -1;
    }

}

class Main {
    public static void main(String[] args) {
        int a[][] = { {1,2,3},{1,2},{5,88,65,25,5}};
        System.out.println(SentinalSearch.search(a, 6));
    }

}