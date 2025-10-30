package Practice;

public class setMatrixZeroes {

    public static void main(String[] args) {
        int[][] matrix={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};
        int n=4;
        int hashrow[]=new int[n];
        int hashcol[]=new int[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    hashcol[j]=1;
                    hashrow[i]=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(hashrow[i]==1 || hashcol[j]==1){
                    System.out.print(matrix[i][j]=0);
                }else{
                    System.out.print(matrix[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
//brute
public class setMatrixZeroes {
    public static void markrow(int[][] matrix,int i,int n){
        for(int k=0;k<n;k++){  
            if(matrix[i][k]!=0){
                matrix[i][k]=-1;
            }
        }
    }
    public static void markcol(int[][] matrix,int j,int n){
        for(int k=0;k<n;k++){
            if(matrix[k][j]!=0){
                matrix[k][j]=-1;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    markrow(matrix,i,n); 
                    markcol(matrix,j,n); 
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){   
                    System.out.print(matrix[i][j]=0);
                }else{
                    System.out.print(matrix[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

*/