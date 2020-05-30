#include<iostream>
using namespace std;
int fib(int x)
{
  if(x==0 || x==1)
    return x;
  else
    return fib(x-1)+fib(x-2);
}
int main()
{
  int n,i=0;
  cin>>n;
  int t;
  while(i<n)
  {
  	t=fib(i);
    i++;
  }
  cout<<"The term "<<n<<" in the fibonacci series is "<<t;
}