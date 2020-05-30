#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2;
  int tot_d,tot_c,extra;
  cin>>d1>>c1>>d2>>c2;
  tot_d=d1+d2;
  tot_c=c1+c2;
  if(tot_c>=100)
  {
  	extra=tot_c-100;
    tot_d=tot_d+1;
    cout<<tot_d<<"\n";
    cout<<extra;
  }
  else
  {
  	cout<<tot_d<<"\n";
    cout<<tot_c;
  }
}