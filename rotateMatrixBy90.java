package Practice;

//inplace - for square matrix only

public class rotateMatrixBy90{
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;
        int m=matrix.length/2;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-(j+1)];
                matrix[i][n-(j+1)]=temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*

public class rotateMatrixBy90 {
    public static void main(String[] args) {
        int[][] matrix={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(matrix[j][i]+" ");//need other 2d array to store
            }
            System.out.println();
        }
    }
}
*/
