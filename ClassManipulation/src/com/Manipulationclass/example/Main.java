package com.Manipulationclass.example;

public class Main {
    public static void main(String[] args) {
        performCalculation();






    }

    public static double performCalculation(){
        double result = 0;
        MathEquation[] equations = new MathEquation[4];
        equations[0].leftVal = 13;
        equations[0]  = create(100,200,'a');
        equations[1]  = create(51, 17,'s');
        equations[2]  = create(92,13, 'm');
        equations[3]  = create(100,200,'d');
        for(MathEquation equation : equations){
            result = equation.execute();
            System.out.println("result = " + result);
        }
        return result;
    }

    public static MathEquation create(double rightVal, double leftVal, char opCode){
         MathEquation equation = new  MathEquation();
         equation.leftVal = leftVal;
         equation.rightVal = rightVal;
         equation.opCode = opCode;

         return equation;
    }

}
