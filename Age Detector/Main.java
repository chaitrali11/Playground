#include<iostream>
using namespace std;
int main()
{
  int birth_yr,curr_yr;
  cin>>birth_yr>>curr_yr;
  if(birth_yr > curr_yr)
    cout<<100-birth_yr+curr_yr;
  else
    cout<<curr_yr-birth_yr;
}