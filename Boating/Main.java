#include<iostream>
using namespace std;
int main()
{
  int wtb,a,c;
  int aw=75,cw=30;
  cin>>wtb>>a>>c;
  if(wtb>(a*aw+c*cw))
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}