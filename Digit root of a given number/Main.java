#include<iostream>
using namespace std;
int dig_sum(int x)
{
	int rem,sum=0;
	while(x!=0)
	{
		rem=x%10;
		sum+=rem;
		x/=10;
	}
	if(sum>10)
		return dig_sum(sum);
	else
		return sum;
	
}
int main()
{
  int n,cnt=0;
  cin>>n;
  
  cout<<dig_sum(n);
  
}