//============================================================================
// Name        : Type_size_explorer.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <stdio.h>

int main() {
	printf("Size of short int is %d bytes",sizeof(short int));
	printf("\nSize of int is %d bytes",sizeof(int));
	printf("\nSize of long int is %d bytes",sizeof(long int));
	printf("\nSize of long long int is %d bytes",sizeof(long long int));
	printf("\nSize of unsigned int is %d bytes",sizeof(unsigned int));
	printf("\nSize of short float is %d bytes",sizeof(float));
	printf("\nSize of short double is %d bytes",sizeof(double));
	printf("\nSize of short long double is %d bytes",sizeof(long double));
	printf("\nSize of short char is %d bytes",sizeof(char));


	return 0;
}
/*
 1. Which two types have the same size on your machine?
 Ans:- int and long int

 2.Does unsigned int have a different size than int?
 Ans:- No, unsigned int and int have same size of 4 bytes.
*/






