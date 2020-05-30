#include<iostream>
using namespace std;
int main()
{
  int n,start=121,cnt=104;
  cin>>n;
  for(int i=0;i<n;i++)
  {
  	cout<<start<<" ";
    start=start+cnt;
    cnt=cnt+32;
  }
}