#include<iostream>

#include<iostream>
#include<math.h>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int i,k,rem,cnt=0,a=0;
  k=n;
  int temp=n;
  while(k!=0)
  {
    cnt++;
    k=k/10;
  }
  //cout<<cnt;
  while(n!=0)
  {
  	rem=n%10;
    a=a+pow(rem,cnt);
    n/=10;
  }
  //cout<<a;
  if(temp==a)
    return 1;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}