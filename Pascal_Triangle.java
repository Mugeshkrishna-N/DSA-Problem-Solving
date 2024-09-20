import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int[][] pascalTriangle = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            pascalTriangle[i][0] = 1;  
            
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    pascalTriangle[i][j] = 1; 
                } else {
                    pascalTriangle[i][j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];  
                }
            }
        }
        
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
