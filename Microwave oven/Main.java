#include<iostream>
using namespace std;
int main()
{
  int no;
  float ht;
  cin>>no>>ht;
  if(no==2)
    cout<<ht+(ht*0.5);
  else if(no==3)
    cout<<ht*2;
  else
    cout<<"Number of items is more";
}