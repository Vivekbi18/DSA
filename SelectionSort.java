import java.util.Arrays;

class SelectionSort {

    public static void main(String[] args) {
        int a[] = {45,1,-23,0,-6,12,0,45,-3};
        selectionSort(a);
     System.out.println(Arrays.toString(a));
    }

    static void selectionSort(int a[]){

        for(int i=0;i<a.length;i++){
        
            for(int j=0;j<a.length-i;j++){
                int last = a.length-i-1;
                int maxIndex = getMaxIndex(a,last); 
                swap(a,maxIndex,last);
            }
        }
    }

    static int getMaxIndex(int a[], int end){
        int max = 0;
        for(int i=0;i<=end;i++){
           if(a[i]>a[max]){
            max = i;
           }
        }
        return max;
    }
    static void swap(int a[],int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}