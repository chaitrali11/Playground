#include<iostream>
using namespace std;
int main()
{
  int n,rem,cnt_even=0,cnt_odd=0;
  cin>>n;
  while(n>0)
  {
  	rem=n%10;
    if(rem%2==0)
      cnt_even+=rem;
    else if(rem%2!=0)
      cnt_odd+=rem;
    n/=10;
  }
  if(cnt_even==cnt_odd)
    cout<<"Yes";
  else
    cout<<"No";
}