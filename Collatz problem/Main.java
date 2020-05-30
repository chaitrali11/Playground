#include<iostream>
using namespace std;
int main()
{
  int n,cnt=0;
  cin>>n;
  cout<<n<<"\n";
  while(n>1)
  {
  	if(n%2!=0)
    {
      cout<<3*n+1<<"\n";
      n=3*n+1;
      cnt++;
    }
    else
    {
      cout<<n/2<<"\n";
      n=n/2;
      cnt++;
    }
  }
  cout<<cnt;
}