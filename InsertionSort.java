import java.util.Arrays;

class InsertionSort {


static void insertionSort(int a[]){

    for(int i=0;i<a.length-1;i++){
       
        for(int j=i+1;j>0;j--){
        
            if(a[j]<a[j-1]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
               
            }
            else{
            break;
        }

        }
        
    }

}
public static void main(String[] args) {
    int a[] = {12,32,-23,0,88,-988,0,23,1,0,32,-1,9};
    insertionSort(a);
    System.out.println(Arrays.toString(a));
}

}

