package Practice;

public class rotateMatrixBy90 {
    public static void main(String[] args) {
        int[][] matrix={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(matrix[j][i]+" ");//or we can store in other 2d array
            }
            System.out.println();
        }
    }
}
