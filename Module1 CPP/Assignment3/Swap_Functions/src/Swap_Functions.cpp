//============================================================================
// Name        : Swap_Functions.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include<iostream>
using namespace std;

void swapByValue(int a, int b){
    int temp = a;
    	a = b;
    	b = temp;
    cout<<"Inside Swap by Value: a = " <<a<<", b = "<<b<<endl;
}

void swapByAddress(int *a, int *b){
	int temp =*a;
    	*a = *b;
        *b = temp;
    cout<<"Inside Swap by Address: *a = "<<*a<<", *b = "<<*b<<endl;
   }

void swapByReference(int &a, int &b){
    int temp = a;
    	a = b;
        b = temp;
    cout<<"Inside Swap by Reference: a = "<<a<<", b = "<<b<<endl;
  }

int main(){
    int a = 10;
    int b = 20;

    cout<<"Original values: a = "<<a<<", b = "<<b<<endl;
    cout<<"----------------------------------------"<<endl;

    swapByValue(a, b);
    cout<<"After Swap by Value: a = " <<a<< ", b = "<<b<<endl;
    cout<<"------------------------------------------"<<endl;

    swapByAddress(&a, &b);
    cout<<"After Swap by Address: a = "<<a<<", b = "<<b<<endl;
    cout<<"--------------------------------------------"<<endl;

    int x =10;
    int y =20;
    swapByReference(x,  y);
    cout<<"After Swap by Reference: a = "<<x<<", b = "<<y<<endl;
      return 0;


}
