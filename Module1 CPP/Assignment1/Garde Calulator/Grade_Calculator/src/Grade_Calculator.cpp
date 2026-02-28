//============================================================================
// Name        : Grade_Calculator.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <stdio.h>

int main() {
	float sub1 = 50.00;
	float sub2 = 65.00;
	float sub3 = 59.00;
	float sub4 = 89.00;
	float sub5 = 95.00;
	float avg;

	avg = (sub1+sub2+sub3+sub4+sub5)/5;

	char grade = (avg>=75.00) ? 'A' :
				 (avg>=60.00) ? 'B' :
				 (avg>=45.00) ? 'C' :
		    	 'F';

	printf("Marks of Subject 1: %.2f",sub1);
	printf("\nMarks of Subject 2: %.2f",sub2);
	printf("\nMarks of Subject 3: %.2f",sub3);
	printf("\nMarks of Subject 4: %.2f",sub4);
	printf("\nMarks of Subject 5: %.2f",sub5);
	printf("\nTotal Percentage: %.2f",avg);
	printf("\nGrade: %c",grade);

	return 0;
}
