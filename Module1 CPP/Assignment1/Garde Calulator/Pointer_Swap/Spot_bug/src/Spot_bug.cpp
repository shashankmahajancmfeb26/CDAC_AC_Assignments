//============================================================================
// Name        : Spot_bug.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <stdio.h>
void doubleIt(int &n) {
    n = n * 2;
printf("Inside doubleIt: %d\n", n);
}
int main() {
int num = 7;
    doubleIt(num);
printf("In main after call: %d\n", num);
return 0;
}

/*
Before Fix the Bug
Output:
	Inside doubleIt: 14
	In main after call: 7

After Fix the Bug
Output:
	Inside doubleIt: 14
	In main after call: 14
*/
