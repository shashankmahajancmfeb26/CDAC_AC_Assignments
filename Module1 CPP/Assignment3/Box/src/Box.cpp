//============================================================================
// Name        : Box.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
class Box{

    int length;
    int width;
    int height;

    public:
    Box(int length, int width, int height){
       this-> length = length;
       this-> width = width;
       this-> height = height;
    }
    void setDimension(int length,int width,  int height){
        this-> length =length;
        this-> width =width;
        this-> height =height;
    }
    int volume(){
        return length * width * height;

    }
};
int main(){
    Box b(1,5,4);

    cout<<"Volume using constructor :"<<b.volume()<<endl;

    b.setDimension(6,3,12);
    cout<<"volume after setDimension : "<<b.volume()<<endl;
}

