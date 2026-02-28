//============================================================================
// Name        : Constant_Functions.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <iomanip>
using namespace std;


const float PI = 3.14159f;

float circleArea(float radius){
	float area;
	area = PI*radius*radius;
	cout<<"Area of Circle: "<<area<<endl;
}
float circlePerimeter(float radius){
	float circum;
	circum = 2*PI*radius;
	cout<<"Circumference of Circle: "<<circum<<endl;
}



int main() {
	float radius = 7.0f;
	//PI = 3.0f;   //error: assignment of read-only variable 'PI'
	std::cout << std::fixed << std::setprecision(4);
	circleArea(radius);
	circlePerimeter(radius);
	return 0;
}
