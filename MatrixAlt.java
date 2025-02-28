public class MatrixAlt {
    public static void main(String[] args) {
        int [][]  arr = {{5,4,7},{1,8,3},{9,6,2}};
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
               if(i!=j){
                   arr[j][i] = arr[i][j];
               }
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
