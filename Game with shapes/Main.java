#include<iostream>
using namespace std;
int main()
{
  int len,rad;
  double a_c,a_s;
  cin>>rad>>len;
  a_c=3.14*rad*rad;
  a_s=len*len;
  if(a_c > a_s)
    cout<<"circle cannot be inside a square";
  else
  {
  	if(rad*2 > len)
      cout<<"circle cannot be inside a square";
    else
      cout<<"circle can be inside a square";
  }
    
}