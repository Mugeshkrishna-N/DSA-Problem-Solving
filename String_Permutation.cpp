#include<stdio.h>
#include<string.h>
int main()
{
    char str[20];
    gets(str);
    int l =strlen(str);
    permute(str,0,l-1);
    getchar();
    return 0;
}
void swap(char *a,char *b)
{
    char t;
    t=*a;
    *a=*b;
    *b=t;
}
void permute(char *a,int i,int n)
{
    int j;
    if(i==n)
    {
        printf("%s\n",a);
        
    }
    else
    {
        for(j=i;j<=n;j++)
        {
            swap((a+i),(a+j));
            permute(a,i+1,n);
            swap((a+i),(a+j));
        }
    }
}