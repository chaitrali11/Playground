#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int p[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>p[i][j];
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
      cout<<p[j][i]<<" ";
    cout<<"\n";
  }
  return 0;
}