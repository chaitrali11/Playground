#include<iostream>
using namespace std;
int main()
{
  int r,c,n,t,i;
  cin>>r>>c>>n;
  if(n<=c)
    cout<<"Yes";
  else if(n%c==1)
    cout<<"Yes";
  else if(n%c==0)
    cout<<"Yes";
  else
    cout<<"No";
}