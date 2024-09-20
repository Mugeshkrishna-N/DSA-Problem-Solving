//BIT MANIPULATION

/*#include <stdio.h>
int ispowerof2(int n)
{
    if(n<=0)
    {
        return 0;
    }
    else
    {
        return (n&(n-1))==0;
    }
}
int main()
{
    int n;
    scanf("%d",&n);
    if(ispowerof2(n))
    {
        printf("Yes power of 2");
    }
    else
    {
         printf("No power of 2");
    }
}
    //IS POWER OF 2
*/
/*#include <stdio.h>
int count1(int n)
{
    int c=0;
    while(n)
    {
        c+=n&1;
        n=n>>1;
    }
    return c;
}
int main()
{
    
    int n;
    scanf("%d",&n);
    printf("%d ",count1(n));
}
    // TO COUNT OF NO OF 1S IN BINARY
*/

/*#include<stdio.h>
int getlen(int n)
{
    int d=0;
    while(n)
    {
        d++;
        n=n>>1;
    }
    printf("%d\n",d);
    return d;
}
int reve(int n)
{
    unsigned int c=0;
    int l=getlen(n);
    int i;
    for(i=0;i<l;i++)
    {
        c=c<<1;
        c|=(n&1);
        n=n>>1;
    }
    return c;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d %d",n,reve(n));
}
        // TO REVERSE THE GIVEN N INTEGER IN BINARY FOR EG : 6 - 110 --- REVERSED = 3 - 011
*/

/*#include<stdio.h>
int unq(int *arr,int l)
{
    int r=0;
    int i;
    for(i=0;i<l;i++)
    {
        r^=*(arr+i);
    }
    return r;
}
int main()
{
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("%d ",unq(a,n));
}
        // TO FIND UNIQUE ELEMENT IN ARRAY
        
*/