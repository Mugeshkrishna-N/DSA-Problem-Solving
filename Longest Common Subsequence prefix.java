import java.util.*;

class Main 
{
    public static int c=0;
    public static String findlongpre(String[] s)
    {
        int m,f,l,i,j;
        int k= s.length;
        String p="";
        System.out.println(k);
        m=1000;
         f=0;
        for(i=0;i<k;i++)
        {
            l=s[i].length();
            System.out.println(l);
            if (l<m)
            {
                m=l;
                p=s[i];
                System.out.println(p);
            }
        }
        int z=p.length();
        System.out.println(z);
        for(i=0;i<z;i++)
        {
            for(j=0;j<k;j++)
            {
                String w=s[j];
                if(w.charAt(i)!=p.charAt(i))
                {
                    f=1;
                    
                    
                }
                
            }
            if(f==1)
            {
                break;
            }
            else{
                    c++;
                }
           
        }
        System.out.println(c);
        String y= p.substring(0,c);
        return y;
      
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int i,j;
        String[] a = new String[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        String k = findlongpre(a);
        if(k=="")
        {
            System.out.printf("Blank");
        }
        else{
        System.out.println(k);
        }
    }
}