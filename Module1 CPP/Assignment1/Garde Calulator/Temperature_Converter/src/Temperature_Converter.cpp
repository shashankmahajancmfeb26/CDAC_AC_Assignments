//============================================================================
// Name        : Temperature_Converter.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <stdio.h>

float celsiusToFahrenheit(float c){

	float f;
	f = (c*9/5)+32;
	printf("Celsius to Fahrenheit: %.2f",f);
}

float fahrenheitToCelsius(float f){

	float c;
	c = (f-32)*5/9;
	printf("\nFahrenheit to Celsius: %.2f",c);
}

int main() {

	celsiusToFahrenheit(20.50);
	fahrenheitToCelsius(85.39);



	return 0;
}
