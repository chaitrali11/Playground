#include<iostream>
using namespace std;
int main()
{
  int en,tn,t,temp=0,i;
  cin>>en>>tn;
  t=en+tn;
  for(i=1;i<t;i++)
  {
  	if(t%i==0)
      temp=temp+i;
  }
  if(t==temp)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}