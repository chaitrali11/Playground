#include<iostream>
using namespace std;
int main()
{
  int n,i,fact=1;
  cin>>n;
  if(n==0)
    cout<<fact;
  else
  {
  	for(i=1;i<=n;i++)
    {
      fact=i*fact;
    }
    cout<<"The factorial of "<<n<<" is "<< fact;
  }
}