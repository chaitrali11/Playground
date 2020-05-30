#include<iostream>
using namespace std;
int pow(int x,int y)
{
	if(y!=0)
		return x*pow(x,--y);
	else
		return 1;
}
int main()
{
  int a,n;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n);
}