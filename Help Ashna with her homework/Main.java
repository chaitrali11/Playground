#include <stdio.h>
int main()
{
   int first, second, add, subtract, multiply,divide, percentage;
 
   
   scanf("%d%d", &first, &second);
 
   add = first + second;
   subtract = first - second;
   multiply = first * second;
   divide = first / second;  
percentage=first%second;

   printf("a+b=%d\n", add);
   printf("a-b=%d\n", subtract);
   printf("a*b=%d\n", multiply);
   printf("a/b=%d\n", divide);
printf("a%b=%d\n", percentage);
 
   return 0;
}