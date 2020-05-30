#include<iostream>
using namespace std;
int main()
{
  int a,b,n,l;
  cin>>a>>b>>n;
  l=a*b;
  if((a+1) <= n && n <= (a*2))
    cout<<"It is a mango tree";
  else if((l-2*b) < n && n <= (l-b))
    cout<<"It is a mango tree";
  else 
    cout<<"It is not a mango tree";
}