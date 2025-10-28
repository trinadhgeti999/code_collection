package Practice;

//given n*n matrix
//sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

public class sumDiagonalElements {
    public static int findSum(int[][] matrix){
        int n=matrix.length;

        int diagonalSum=0;
        for(int i=0;i<n;i++){
            diagonalSum+=matrix[i][i];
                if(i!=n-1-i){
                    diagonalSum+=matrix[i][n-1-i];
                }
        }
        return diagonalSum;
    }

    /*
    //brute-checking every element
    
    public static int findSum(int[][] matrix){
        int n=matrix.length;

        int diagonalSum=0;
        int sdiagonal=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || j==sdiagonal){
                    diagonalSum+=matrix[i][j];
                }
            }
            sdiagonal--;
        }
        return diagonalSum;
    }
    */

    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};

        int result=findSum(matrix);
        System.out.println(result);
    }
}
