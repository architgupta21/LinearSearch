import java.util.Arrays;

public class MinIn2dArray {

        public static void main(String[] args) {
            int[][] arr = {
                    {2,5,7},
                    {23,35,75},
                    {34,65,18},
            };
            int target = 65;
            int[] ans = Search(arr, target);
            System.out.println(Arrays.toString(ans));
        }
        static int[] Search(int[][] arr , int target){
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if(arr[row][col] == target){
                        return new int[]{row,col};
                    }
                }
            }
            return new int[]{-1,-1};
        }
}
