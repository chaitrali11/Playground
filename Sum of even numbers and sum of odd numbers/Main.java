#include <iostream>
//#include <conio.h>
using namespace std;
int main()
{
    int oddSum=0,evenSum=0;
int i,size;
    //cout<<"Enter the size of the array: ";
    cin>>size;
int arr[size];
    //cout<<"Enter the Array elements: ";
    for(i=0; i<size; i++){
            cin>>arr[i];
    }
    for(i=0; i<size; i++){
        if(arr[i]%2==0){
        evenSum=evenSum+arr[i];
        }
    else{
             oddSum=oddSum+arr[i];
        }
    }
    cout<<"The sum of the even numbers in the array is "<<evenSum;
    cout<<"\nThe sum of the odd numbers in the array is "<<oddSum;

    return 0;
}