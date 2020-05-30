#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int k,n,sq,t_sq,temp,rem,rdigit,ldigit,a=0,cnt=0;
	cin>>k;
	temp=k;
	sq=k*k;
	t_sq=sq;
	while(temp>0)
	{
		temp=temp/10;
		cnt++;
	}
	n=cnt;
	for(int i=0;i<n;i++)
	{
		rem=t_sq%10;
		a=a+rem*pow(10,i);
		t_sq=t_sq/10;
	}
	rdigit=a;
	for(int i=0;i<n;i++)
	{
		sq=sq/10;
	}
	ldigit=sq;
	int sq1=k*k;
	if(rdigit+ldigit==k)
	cout<<"Kaprekar Number";
	else
	cout<<"Not a Kaprekar Number";
}