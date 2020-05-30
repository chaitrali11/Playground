#include<iostream>
int main()
{
  int n,cnt=0;
  std::cin>>n;
  do
  {
    cnt++;
    n=n/10;
  }while(n != 0);
  std::cout<<cnt;
}