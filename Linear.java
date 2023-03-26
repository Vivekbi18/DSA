import java.util.Arrays;
import java.util.Scanner;

class Linear{
    static Scanner sc = new Scanner(System.in);

    static int[][] getArray(int r, int c){
        int a[][] = new int[r][c];
        
        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            
            }
        
        }
        return a;
    }
    
    static int[] search(int a[][], int key, int r, int c){
        int b[] = {-1,-1  };

        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){
            
                if(a[i][j]==key){
                    b[0]=i;
                    b[1]=j;
                    return b;
                }
            
            }
        }
        return b;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter size of colums : ");
        int c = sc.nextInt();
        System.out.println("Enter elements : ");
        int a[][] =   Linear.getArray(r,c);
         System.out.print("Enter Key : ");
         int key = sc.nextInt();
         System.out.println("key is found at index "+Arrays.toString(Linear.search(a, key,r,c)));
    }
}