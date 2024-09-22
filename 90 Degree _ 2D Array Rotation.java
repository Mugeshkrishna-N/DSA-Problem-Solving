import java.util.*;
public class Main
{
    public static void rotate90(int[][] a,int r ,int c)
    {
        int i,j,k;
          for(i=0;i<r;i++)
        {
            for(j=0;j<i;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<r/2;j++)
            {
                int t=a[i][j];
                a[i][j]=a[i][r-j-1];
                a[i][r-j-1]=t;
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println("");
        }
        
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    int[][] a = new int[r][c];
	    int i,j,k;
	    for(i=0;i<r;i++)
	    {
	        for(j=0;j<c;j++)
	        {
	            a[i][j]=sc.nextInt();
	        }
	    }
	     for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
	    rotate90(a,r,c);
	}
}
