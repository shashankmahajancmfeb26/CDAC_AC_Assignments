//============================================================================
// Name        : Employee_Management.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <vector>
#include <string>
#include <iomanip>
#include <limits>
using namespace std;

class Employee {
private:
    int empID;
    string empName;
    double empSalary;
    double grossSalary;

public:

    Employee(int id, string name, double salary) : empID(id), empName(name), empSalary(salary), grossSalary(0.0) {}

    int getEmpID() const {
    	return empID;
    }
    string getEmpName() const {
    	return empName;
    }
    double getEmpSalary() const {
    	return empSalary;
    }
    double getGrossSalary() const {
    	return grossSalary;
    }

    void setEmpName(const string& name) {
    	empName = name;
    }
    void setEmpSalary(double salary) {
    	empSalary = salary;
    }

    void calculateGrossSalary() {
        double bonusPercentage = 0.0;
        if (empSalary <= 5000) {
            bonusPercentage = 0.10;
        } else if (empSalary <= 10000) {
            bonusPercentage = 0.15;
        } else {
            bonusPercentage = 0.20;
        }
        grossSalary=empSalary+(empSalary*bonusPercentage);
    }

    void displayEmployeeDetails() const {
        cout<<fixed<<setprecision(2);
        cout<<"\n--- Employee Details ---"<<endl;
        cout<<"ID: " << empID<<endl;
        cout<<"Name: " << empName<<endl;
        cout<<"Base Salary: Rs. "<<empSalary<<endl;
        cout<<"Gross Salary: Rs. "<<(grossSalary > 0 ? grossSalary : empSalary)<<endl;
        cout<<"-----------------------\n"<<endl;
    }
};

void addEmployee(vector<Employee>& employees);
void calculateAndDisplayGrossSalary(vector<Employee>& employees);
void displayAllEmployees(const vector<Employee>& employees);
void updateEmployeeInfo(vector<Employee>& employees);
int findEmployeeIndexByID(const vector<Employee>& employees, int id);
void clearInputBuffer();

int main() {
    vector<Employee> employees;
    int ch;

    do {
        cout<<"===== Employee Payroll Management System ====="<< endl;
        cout<<"1. Add a new employee"<<endl;
        cout<<"2. Calculate and display gross salary for an employee"<<endl;
        cout<<"3. Display all employee details"<<endl;
        cout<<"4. Update employee information"<<endl;
        cout<<"5. Exit" << endl;
        cout<<"Enter your choice: "<<endl;
        cin >> ch;

        if (cin.fail()) {
            cout <<"Invalid input."<<endl;
            clearInputBuffer();
            continue;
        }

        switch (ch) {
            case 1:
                addEmployee(employees);
                break;
            case 2:
                calculateAndDisplayGrossSalary(employees);
                break;
            case 3:
                displayAllEmployees(employees);
                break;
            case 4:
                updateEmployeeInfo(employees);
                break;
            case 5:
                cout<<"Exit"<<endl;
                break;
            default:
                cout<<"Enter Valid Choice."<<endl;
        }
    } while (ch != 5);

    return 0;
}

void clearInputBuffer() {
    cin.clear();
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
}

int findEmployeeIndexByID(const vector<Employee>& employees, int id) {
    for (size_t i = 0; i < employees.size(); ++i) {
        if (employees[i].getEmpID() == id) {
            return static_cast<int>(i);
        }
    }
    return -1;
}

void addEmployee(vector<Employee>& employees) {
    int id;
    string name;
    double salary;
    cout<<"\nEnter employee ID: ";
    cin>>id;

    if (findEmployeeIndexByID(employees, id) != -1) {
        cout<<"Error: Employee ID "<<id<<" already exists."<<endl;
        clearInputBuffer();
        return;
    }

    cout<<"Enter employee name: ";
    clearInputBuffer();
    getline(cin, name);

    cout<<"Enter employee base salary: Rs. ";
    cin>>salary;

    if(cin.fail()||salary<0) {
        cout<<"Invalid salary input."<<endl;
        clearInputBuffer();
        return;
    }

    employees.emplace_back(id, name, salary);
    cout<<"Employee added successfully!\n"<<endl;
}

void calculateAndDisplayGrossSalary(vector<Employee>& employees) {
    int id;
    cout<<"\nEnter employee ID to calculate gross salary: ";
    cin >> id;

    int index = findEmployeeIndexByID(employees, id);
    if (index!=-1) {
        employees[index].calculateGrossSalary();
        employees[index].displayEmployeeDetails();
    } else {
        cout<<"Employee with ID "<<id<<" not found."<<endl;
    }
}

void displayAllEmployees(const vector<Employee>& employees) {
    if(employees.empty()) {
        cout<<"\nNo employee records found.\n"<<endl;
        return;
    }
    cout<<"\n===== All Employee Details ====="<<endl;
    for(const auto& emp : employees) {
        emp.displayEmployeeDetails();
    }
    cout<<"================================\n"<<endl;
}

void updateEmployeeInfo(vector<Employee>& employees) {
    int id;
    cout<<"\nEnter employee ID to update information: ";
    cin>>id;

    int index = findEmployeeIndexByID(employees, id);
    if(index!=-1) {
        int subChoice;
        cout<<"\nSelect information to update:"<<endl;
        cout<<"1. Name"<<endl;
        cout<<"2. Base Salary"<<endl;
        cout<<"Enter your choice: ";
        cin>>subChoice;

        if(cin.fail()) {
            cout<<"Invalid input."<<endl;
            clearInputBuffer();
            return;
        }

        switch(subChoice) {
            case 1:{
                string newName;
                cout<<"Enter new name: "<<endl;
                clearInputBuffer();
                getline(cin, newName);
                employees[index].setEmpName(newName);
                cout<<"Employee name updated successfully."<< endl;
                break;
            }
            case 2: {
                double newSalary;
                cout<<"Enter new base salary: Rs. "<<endl;
                cin>>newSalary;
                if (cin.fail() || newSalary < 0) {
                    cout<<"Invalid salary input."<<endl;
                    clearInputBuffer();
                    return;
                }
                employees[index].setEmpSalary(newSalary);
                employees[index].calculateGrossSalary();
                cout<<"Employee salary and gross salary updated successfully."<<endl;
                break;
            }
            default:
                cout <<"Invalid choice."<<endl;
        }
    } else {
        cout<<"Employee with ID "<<id<<" not found."<<endl;
    }
    cout<<endl;
}
