//============================================================================
// Name        : Pointer_Swap.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int x = 10;
	int y = 20;
	int z = 30;
	int *px = &x;
	int *py = &y;
	int *pz = &z;

	cout<<"Before Swap the Pointer"<<endl;
	cout<<"X: "<<x<<" Y: "<<y<<" Z: "<<z<<endl;
	cout<<"Address of X: "<<px<<"\nAddress of Y: "<<py<<"\nAddress of Z: "<<pz<<endl;

	int sw = *px;
	*px = *pz;
	*pz = sw;

	cout<<"\nAfter Swap the Pointer"<<endl;
	cout<<"X: "<<x<<" Y: "<<y<<" Z: "<<z<<endl;
	cout<<"Address of X: "<<px<<"\nAddress of Y: "<<py<<"\nAddress of Z: "<<pz<<endl;

	return 0;
}
