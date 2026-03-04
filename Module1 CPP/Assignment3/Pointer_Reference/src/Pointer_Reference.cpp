//============================================================================
// Name        : Pointer_Reference.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include<iostream>
using namespace std;

int main(){
    int num = 10;
    cout<<"Original value of Number : "<<num<<endl;

    int *ptr = &num;
    int &ref = num;

    *ptr =20;
    cout<<"After Modification using Pointer :"<<num<<endl;

    ref =30;
    cout<<"After Modification using Reference :"<<num<<endl;

    return 0;

}
