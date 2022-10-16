package src.SOLID.OpenClosed;

import java.security.InvalidParameterException;

public class Calculator {

    /*
     * OCP compliant version here
     * 
     * Now we can add Division or Multiplication and define its perform()-method
     * that will adhere to this
     * calculate()-function
     * 
     * Most, importantly, there is no need to change the calculate()-method anymore
     * 
     */
    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        operation.perform();
    }

    /*
     * not a good example of OCP.
     * When a new functionality comes in we have no way besides changing the
     * calculate() method of the Calculator class.
     * Hence we can say this code is not OCP-compliant.
     * 
     * With every incoming new operation supporting request, calculate() method will
     * need to be changed. We need to extract this code and put in an abstraction
     * layer. Look at solusion (1)
     */

    /*
     * public void calculate(CalculatorOperation operation) {
     * if (operation == null) {
     * throw new InvalidParameterException("Can not perform operation");
     * }
     * 
     * if (operation instanceof Addition) {
     * Addition addition = (Addition) operation;
     * addition.setResult(addition.getLeft() + addition.getRight());
     * } else if (operation instanceof Subtraction) {
     * Subtraction subtraction = (Subtraction) operation;
     * subtraction.setResult(subtraction.getLeft() - subtraction.getLeft());
     * }
     * }
     */
}