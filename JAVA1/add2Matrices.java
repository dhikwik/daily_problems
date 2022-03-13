package JAVA1;

public class add2Matrices {
    public static void add(int[][] mat1,int[][] mat2,int n,int m) {
        int[][] mat3=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat3[i][j] = mat1[i][j]+mat2[i][j]; 
            }

        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(mat3[i][j]+ " ");
            }
            System.out.println("\n");
        }

    }
    public static void main(String[] args) {
        int[][] mat1={
            {1,4,5},
            {5,5,6},
            {7,5,6}
        };
        int[][] mat2={
            {4,5,6},
            {8,5,6},
            {6,5,4}
        };
        add(mat1,mat2,3,3);
    }
    
}
