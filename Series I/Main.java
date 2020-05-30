#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n;
  double start;
  cin>>n;
  start=0.5;
  for(int i=0;i<n;i++)
  {
  	cout<<start<<" ";
    start=start+pow(3,i);
  }
}