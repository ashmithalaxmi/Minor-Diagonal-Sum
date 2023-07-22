import java.util.Scanner;

public class MinorDiagonalSum {
    static int minorDiagonalSum(int[][] A, int n){
        int i=0, sum=0;
        int j=n-1;
        while(i<n && j>=0){
            sum+=A[i][j];
            i++;
            j--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        int col = row;
        int[][] A = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                A[i][j]= sc.nextInt();
            }
        }
        System.out.println(minorDiagonalSum(A,row));
    }
}
