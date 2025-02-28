import java.util.Arrays;

public class FindThird {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = arr.length;
        int m = arr[0].length;
        int[] temp = new int[9];
        int s = temp.length;
        int ind = 0;
        for (int i = 0; i < n; i++) {
            for(int j =0;j<m;j++){
                temp [ind]= arr[i][j];
                ind++;
            }
        }
        int thirdLarge= temp[s-3];
        System.out.println(Arrays.toString(temp));
        System.out.println("The third largest element is " + thirdLarge);
    }
}
