//============================================================================
// Name        : Malloc_New.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include<iostream>
using namespace std;

int main(){
    int *arr = new int[5];

    cout<<"Enter Integers :"<<endl;
    for(int i =0; i<5;i++){
        cin>>arr[i];
    }

    for (int i= 0;i<5;i++){
        cout<<arr[i]<<"   ";
    }
    delete[] arr;
}
