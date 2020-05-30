#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  double tb,tr,rs,bb,ov,co,b,c;
  int a;
  cin>>tb>>tr>>rs>>bb;
  ov=tb/6;
  co=bb/6;
  a=(int)bb/6;
  b=(int)bb%6;
  c=b/10;
  cout<<ov<<"\n";
  cout<<(a+c)<<"\n";
  cout<<fixed<<setprecision(1)<<rs/(a+c)<<"\n";
  cout<<tr/ov<<"\n";
  if((rs/co) > (tr/ov))
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";

}