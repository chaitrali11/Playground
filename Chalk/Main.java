#include<math.h>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,days,rem;
  cin>>n;
  rem=n*1/sqrt(n);
  days=n+rem+1;
  cout<<days;
}