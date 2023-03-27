import java.util.Arrays;

class BubbleSort {
public static void main(String[] args) {
    int a[] = {21,1};
    bubbleSort(a);
    System.out.println(Arrays.toString(a));
}
static void bubbleSort(int a[]){

    for(int i=0;i<a.length;i++){
        boolean b = false;
        for(int j=1;j<a.length-i;j++){
           if(a[j-1]>a[j]){
            int temp = a[j];
            a[j] = a[j-1];
            a[j-1] = temp;
            b = true;
           }
        }
        if(b==false){
            break;
        }
    }

}





}