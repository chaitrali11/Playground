#include<iostream>
using namespace std;
int main()
{
  int x,l,i;
  cin>>x;
  l=x%10;
  for(i=0;i<3;i++)
  {   
  	x=x/10;
  }
  	cout<<(x+l);
}