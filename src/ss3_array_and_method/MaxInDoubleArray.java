package ss3_array_and_method;
public class MaxInDoubleArray {
    static void main(String[] args) {
        int[][] doubleArray= {{1,2,3},{4,5,6},{7,8,9}};
        int Max=doubleArray[0][0];
        for (int i = 0; i <doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
            if(doubleArray[i][j]>=Max){
             Max=doubleArray[i][j];
            }
            }
        }
        System.out.print("MAX trong mang 2 chieu la: "+ Max);
    }
}
