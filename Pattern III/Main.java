#include<iostream>
using namespace std;
int main()
{
  int i,j,n;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(j<i) 
        cout<<i<<"*";//printf("%d*",i);
      else 
        cout<<i;//printf("%d",i);
    }
    cout<<"\n";//printf(" \n");
  }
  for(i=n;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
      if(j<i) 
        cout<<i<<"*";//printf("%d*",i);
      else 
        cout<<i;//printf("%d",i);
    }
    cout<<"\n";//printf(" \n");
  }  
  return 0;
}