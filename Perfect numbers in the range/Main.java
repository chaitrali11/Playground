#include<iostream>
using namespace std;
int main()
{
  int start,end;
  cin>>start>>end;
  for(int i=start;i<=end;i++)
  {
    int sum=0;
    for(int j=1;j<i;j++)
    {
      if(i%j==0)
        sum=sum+j;
    }
    if(sum==i)
      cout<<i<<" ";
  }
}
