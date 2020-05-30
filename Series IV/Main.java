#include<iostream>
using namespace std;
int main()
{
  int n,t1=0,t2=2,cnt=2;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    cout<<t1<<" ";
  	t1=t2;
  	if(i%2!=0)
  	{
      t2=t2+(cnt+4);
      cnt=cnt+4;	
	}
	else
      t2=t2+cnt;
  }
}