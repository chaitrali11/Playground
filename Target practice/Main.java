#include<iostream>
using namespace std;
int main()
{
  int sum=0,count=0;
  int n;
  cin>>n;
  do
  {
    int n1;
    cin>>n1;
    sum=sum+n1;
    count++;
  }while(sum<n);
  cout<<"The number of turns is "<<count;
}