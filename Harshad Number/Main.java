#include<iostream>
using namespace std;
int main()
{
  int n,temp,a,cnt=0;
  cin>>n;
  temp=n;
  while(temp != 0)
  {
  	a=temp%10;
    cnt=cnt+a;
    temp=temp/10;
  }
  if(n%cnt==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}