#include<iostream>
using namespace std;
int main()
{
  int fb,sb,tb,i,d;
  cin>>fb>>sb>>tb;
  if(fb > sb && fb > tb)
  {
  	if(sb > tb)
      cout<<"The treasure is in box which has number "<<sb<<"\n";
    else
      cout<<"The treasure is in box which has number "<<tb<<"\n";
  }
  else if(sb > fb && sb > tb)
  {
  	if(fb > tb)
      cout<<"The treasure is in box which has number "<<fb<<"\n";
    else
      cout<<"The treasure is in box which has number "<<tb<<"\n";
  }
  else
  {
  	if(fb > sb)
      cout<<"The treasure is in box which has number "<<fb<<"\n";
    else
      cout<<"The treasure is in box which has number "<<sb<<"\n";
  }
  
  if(fb<sb && fb<tb)
    d=fb;
  else if(sb<fb && sb<tb)
    d=sb;
  else
    d=tb;
  for(i=d;i>0;i--)
  {
    if(fb%i==0 && sb%i==0 && tb%i==0)
      break;
    else
	d--;
   }
  cout<<"The code to open the box is "<<d;
 }