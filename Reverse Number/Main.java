#include<iostream>
using namespace std;
int main()
{
  int n, rn=0, rem;
  cin>>n;
  while(n != 0)
  {
  	rem = n%10;
    rn = rn*10 + rem;
    //cout<<rn;
    n=n/10;
  }
  cout<<rn;
}