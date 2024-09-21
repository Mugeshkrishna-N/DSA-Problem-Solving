/*The lexicographic rank of a string refers to its position in the list of all possible permutations of the string's characters, 
sorted in dictionary or lexicographical order. Lexicographical order is
essentially the order in which words are arranged in a dictionary, 
meaning it is based on the alphabetical order of their component letters.*/

import java.util.*;
class Main 
{
    static int fact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
        
    }
    static int findlex(String a)
    {
        int n=a.length();
        int res=1;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=i+1;j<n;j++)
            {
                if(a.charAt(i)>a.charAt(j))
                {
                    c++;
                }
            }
            res+=c*fact(n-i-1);
            
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.printf("Lexicographical Rank of a String %s is %d\n",s,findlex(s));
    }
}