//============================================================================
// Name        : Student_Management.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>
using namespace std;

class Student {
    string name;
    int rollNo;
    float marks;
    char grade;

public:
    void setName(string n){
    	name = n;
    }
    void setRollNumber(int r){
    	rollNo = r;
    }
    void setMarks(float m){
    	marks = m;
    }

    string getName(){
    	return name;
    }
    int getRollNumber(){
    	return rollNo;
    }
    float getMarks(){
    	return marks;
    }
    char getGrade(){
    	return grade;
    }

    void calculateGrade() {
        if (marks >= 90)
        	grade = 'A';
        else if (marks >= 80 && marks<=89)
        	grade = 'B';
        else if (marks >= 70 && marks<=79)
        	grade = 'C';
        else if (marks >= 60 && marks<=69)
        	grade = 'D';
        else grade = 'F';
    }
};

int main() {
    Student s;
    int ch;
    string tname;
    int troll;
    float tmarks;

    do {
        cout <<"1. Accept Information\n2. Display Information\n3. Calculate Grade\n4. Exit\nEnter your choice: ";
        cin >> ch;

        switch (ch) {
            case 1:
                cout<<"Enter Name:";
                cin>>tname;
                cout<<"Enter Roll Number:";
                cin>>troll;
                cout<<"Enter Marks:";
                cin>>tmarks;
                s.setName(tname); s.setRollNumber(troll); s.setMarks(tmarks);
                break;
            case 2:
                cout<<"Name: "<<s.getName()<<"\nRoll: "<<s.getRollNumber()<<"\nMarks: "<<s.getMarks()<<"\nGrade: "<<s.getGrade()<<endl;
                break;
            case 3:
                s.calculateGrade();
                cout<<"Grade Calculated!"<<endl;
                break;
            case 4:
                cout<<"Exit...";
                break;
            default:
                cout<<"Please put valid choice!";
        }
    } while (ch != 4);
    return 0;
}
