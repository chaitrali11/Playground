#include<iostream>
using namespace std;
int main()
{
  int n,start=6,cnt=5;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
  	cout<<start<<" ";
    start=start+cnt*i;
  }
}