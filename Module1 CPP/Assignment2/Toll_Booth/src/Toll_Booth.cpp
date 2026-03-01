//============================================================================
// Name        : Toll_Booth.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <iomanip>
using namespace std;

class TollBooth {
private:
    int totalVehicles;
    double totalRevenue;

public:
    TollBooth() : totalVehicles(0), totalRevenue(0.0) {}

    void vehiclePayingToll(int vehicleType, double tollAmount) {
        totalVehicles++;
        totalRevenue += tollAmount;
        cout <<"Vehicle Passed. Toll collected: Rs."<<fixed<<setprecision(2)<<tollAmount<<endl;
    }

    int getTotalVehicles() {
    	return totalVehicles;
    }
    double getTotalRevenue() {
    	return totalRevenue;
    }

    void reset() {
        totalVehicles = 0;
        totalRevenue = 0.0;
        cout <<"Booth Reset Succesfully."<<endl;
    }
};

int main() {
    TollBooth booth;
    int ch;
    const double car_toll = 180.0;
    const double truck_toll = 300.0; // Example, added custom value
    const double bus_toll = 350.0;

    do {
        cout << "--- Toll Booth Management System ---"<<endl;
        cout << "1. Add a standard car (Rs. 180)"<<endl;
        cout << "2. Add a truck (Rs. 300)"<<endl;
        cout << "3. Add a bus (Rs. 350)"<<endl;
        cout << "4. Display total cars passed"<<endl;
        cout << "5. Display total revenue collected"<<endl;
        cout << "6. Reset booth statistics"<<endl;
        cout << "7. Exit"<<endl;
        cout << "Enter your choice: "<<endl;
        cin >> ch;

        switch (ch) {
            case 1:
                booth.vehiclePayingToll(1, car_toll);
                break;
            case 2:
                booth.vehiclePayingToll(2, truck_toll);
                break;
            case 3:
                booth.vehiclePayingToll(3, bus_toll);
                break;
            case 4:
                cout<<"Total vehicles passed: "<<booth.getTotalVehicles()<<endl;
                break;
            case 5:
                cout<<"Total revenue collected: Rs."<<booth.getTotalRevenue()<<endl;
                break;
            case 6:
                booth.reset();
                break;
            case 7:
                cout <<"Exit"<<endl;
                break;
            default:
                cout<<"Invalid choice..."<<endl;
        }
    } while(ch!=7);

    return 0;
}
