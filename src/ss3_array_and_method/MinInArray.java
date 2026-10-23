package ss3_array_and_method;
public class MinInArray {
    static void main(String[] args) {
        int[][] doubleArray= {{1,2,3},{4,5,6},{7,8,9}};
        int Min=doubleArray[0][0];
        for (int i = 0; i <doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                if(doubleArray[i][j]<=Min){
                    Min=doubleArray[i][j];
                }
            }
        }
        System.out.print("Min trong mang 2 chieu la: "+ Min);
        int[] Array= {1,2,3,4,5};
        int min = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if(Array[i] <= min){
                min=Array[i];
            }
        }
        System.out.print("\nMin trong mang 1 chieu la: "+ min);
    }
}
