#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float i,d,a;
  cin>>p>>r>>t;
  i=(p*r*t)/100;
  d=i*0.02;
  a=p+i;
  cout<<i<<"\n";
  cout<<a<<"\n";
  cout<<d<<"\n";
  cout<<a-d;
}