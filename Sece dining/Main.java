#include<iostream>
using namespace std;
int main()
{
  string s;
  int rail;
  cin>>s>>rail;
  if(s=="front")
  {
  	if(rail==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else if(s=="rear")
  {
  	if(rail==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
}