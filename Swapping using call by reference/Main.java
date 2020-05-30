#include<iostream>
#include<stdio.h>
void swap(int*, int*);
 
int main()
{
   int x, y;
 
   
   scanf("%d%d",&x,&y);
 
   
 std::cout<<"Before swapping a= "<< x<<" and b=" <<y;   
swap(&x, &y); 
 
   
std::cout<<"\nAfter swapping a= "<< x<<" and b=" <<y;   
   return 0;
}
 
void swap(int *a, int *b)
{
   int temp;
 
   temp = *b;
   *b = *a;
   *a = temp;   
}