//============================================================================
// Name        : Employee.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>

class Employee {

    const int employeeId;
    std::string name;
    float salary;

public:

    Employee(int id, std::string n, float s) : employeeId(id), name(n), salary(s) {

    }

    void printdetails() const {
        std::cout<< "ID: "<< employeeId <<std::endl;
        std::cout<<"Name: "<<name<<std::endl;
        std::cout<< "Salary: Rs."<<salary<<std::endl;
    }
};

int main() {
    Employee e(101, "Sushant Patil", 35000.00);
    e.printdetails();
    return 0;
}
