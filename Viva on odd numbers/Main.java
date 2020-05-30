#include<iostream>
using namespace std;
int main()
{
  int n,odd=0;
  double cnt=0;
  do
  {
  	cin>>n;
  	if(n%2!=0 && n>0)
    {
      cnt++;
      odd++;	
    }
    else if(n%2==0 && n>0)
      cnt=cnt-0.5;  	
	else if(n<0)
	{
      cnt--;
      break;
    }
  }while(odd<3);
  cout<<cnt;
}