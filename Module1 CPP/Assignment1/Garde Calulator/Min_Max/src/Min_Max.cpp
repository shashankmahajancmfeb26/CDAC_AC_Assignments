//============================================================================
// Name        : Min_Max.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void findMinMax(int a, int b, int c, int &minval, int &maxval){
	minval = a;
	maxval = b;

	if(b < minval)
		minval = b;
	if(c < minval)
		minval = c;

	if(b > maxval)
		maxval = b;
	if(c > maxval)
		maxval = c;
}

int main() {
	int a = 16;
	int b = 35;
	int c = 49;
	int hi, lo;

	cout<<"Three Numbers are "<<a<<" "<<b<<" "<<c<<endl;

	findMinMax(a, b, c, lo, hi);


	cout<<"Minimum Number is "<<lo<<endl;
	cout<<"Maximum Number is "<<hi<<endl;

	if (hi==49 && lo==16)
		cout<<"original variables are updated after the call"<<endl;
	else
		cout<<"original variables are not updated after the call"<<endl;
	return 0;
}
