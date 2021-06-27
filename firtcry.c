//even numbers in a given array:
#include<stdio.h>
int main()
{
    int array[100],i,limit;
    printf("enter value");
    scanf("%d",&limit);
    printf("enter values");
    for(i=0;i<limit;i++)
    {
        scanf("%d",&array[i]);
    }
     printf("even numbers in given array are: ");
    for(i=0;i<limit;i++)
    {
        if(array[i]%2==0)
        {
            printf("%d\t",array[i]);
        }
    }
}