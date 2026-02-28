//============================================================================
// Name        : Absolute_Value_Clamp.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int absolute(int n) {
    return (n<0)?-n:n;
}

int clamp(int val, int lo, int hi) {
    return (val<lo)?lo:((val>hi)?hi:val);
}

int main() {
    int val, lo, hi;
	int arr[][3] ={{-15, -10, 10},
				   {0, -10, 10},
				   {25, -10, 10},
				   {-3, 0, 5}};

    int x = sizeof(arr)/sizeof(arr[0]);

    cout<<"val\tlo\thi\tabsolute(val)\tclamp(val, lo, hi)"<<endl;
    cout<<"-----------------------------------------------------------"<<endl;

    for(int i=0;i<x;++i) {
        val = arr[i][0];
        lo = arr[i][1];
        hi = arr[i][2];

        int abs = absolute(val);
        int clamp = clamp(val, lo, hi);

        cout<<val<<"\t"<<lo<<"\t"<<hi<<"\t"<<abs<<"\t\t"<<clamp<<endl;
    }

    return 0;
}
