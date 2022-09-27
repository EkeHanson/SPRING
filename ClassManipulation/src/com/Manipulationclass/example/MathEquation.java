package com.Manipulationclass.example;

public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    double result;

    public double execute(){
        switch (opCode){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case  'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = leftVal / rightVal;
                break;
        }
        return result;
    }

}
