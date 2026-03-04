//============================================================================
// Name        : Student.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include<iostream>
#include <string>
using namespace std;

class Student{
    int rollNo;
    string name;
    float marks;

public:
    Student(){           //Default Constructor
    	rollNo = 0;
    	name = " ";
    	marks = 0.0;

    }
    Student(int r, string n, float m){		//Parameterized Constructor
        rollNo = r;
        name = n;
        marks = m;
    }

    void constructusingthis(int rollNo, string name, float marks){     	//Constructor using this pointer
    	this->rollNo =rollNo;
    	this->name = name;
    	this->marks = marks;
    }
    void printdetails(){
    	cout<<"RollNumber : "<<rollNo<<endl;
    	cout<<"Name : "<<name<<endl;
    	cout<<"Marks : "<<marks<<endl;
    }
};
int main(){
    Student s;
    Student s1(101,"Sumit",95.0f);
    Student s2(102,"Ishwar",68.0f);
    s.printdetails();
    s1.printdetails();
    s2.printdetails();
}
