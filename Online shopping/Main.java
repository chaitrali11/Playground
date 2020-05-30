#include<iostream>
using namespace std;
int main()
{
  int flip_amnt,flip_disc,flip_ship;
  int snap_amnt,snap_disc,snap_ship;
  int amzn_amnt,amzn_disc,amzn_ship;
  int price_flip,price_snap,price_amzn;
  
  cin>>flip_amnt>>flip_disc>>flip_ship;
  cin>>snap_amnt>>snap_disc>>snap_ship;
  cin>>amzn_amnt>>amzn_disc>>amzn_ship;
  
  double disc_f=(double)flip_disc/100;
  double disc_s=(double)snap_disc/100;
  double disc_a=(double)amzn_disc/100;
  
  price_flip=flip_amnt-(flip_amnt*disc_f)+flip_ship;
  price_snap=snap_amnt-(snap_amnt*disc_s)+snap_ship;
  price_amzn=amzn_amnt-(amzn_amnt*disc_a)+amzn_ship;
  
  cout<<"In Flipkart Rs."<<price_flip<<"\n";
  cout<<"In Snapdeal Rs."<<price_snap<<"\n";
  cout<<"In Amazon Rs."<<price_amzn<<"\n";
  
  if(price_flip <= price_snap && price_flip <= price_amzn)
    cout<<"He will prefer Flipkart";
  else if(price_snap <= price_flip && price_snap <= price_amzn)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}