import java.util.ArrayList;
import java.util.List;

public class AbundantNumInMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1184,1223,4553},{1210,1216,3323},{2234,9876,6574}};
        int n = arr.length;
        int m = arr[0].length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
               int sum = abd(arr[i][j]);
               if(sum > arr[i][j]){
                   System.out.println(arr[i][j]);
                   ans.add(arr[i][j]);
               }
            }
        }
        if(ans.size()%2 == 1){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

    }

    static int abd(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
