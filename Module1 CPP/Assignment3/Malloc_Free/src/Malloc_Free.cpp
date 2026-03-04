//============================================================================
// Name        : Malloc_Free.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include<iostream>
using namespace std;

int main(){
     int *arr = (int*)malloc (5 * sizeof(int));

     if(arr ==NULL)
    {
        cout <<"Memory Allocation Failed...";
    }

    cout<<"Enter Integers :";
    for(int i =0; i<5;i++){
        cin>>arr[i];
    }
    for (int i= 0;i<5;i++){
        cout<<arr[i]<<"   ";
    }
    free(arr) ;
    return 0;
}
