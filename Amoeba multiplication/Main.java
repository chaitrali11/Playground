#include<iostream>
using namespace std;
int main()
{
  int n,t1=0,t2=1,next_term;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
  	if(i==n)
    {
      cout<<t1;
      break;
    }
    //cout<<t1;
    next_term=t1+t2;
    t1=t2;
    t2=next_term;
  }
}