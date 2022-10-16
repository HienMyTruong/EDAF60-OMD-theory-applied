package src.SOLID.OpenClosed;

public class Subtraction implements CalculatorOperation {
    private double left;
    private double right;
    private double result;

    public Subtraction(double left, double right) {
        this.left = left;
        this.right = right;
    }

    /*
     * solution(1): a perform()/operand() method that handles any operation (adding,
     * subtracting or multiplying...etc
     */
    @Override
    public void perform() {
        if (right != 0) {
            result = left / right;
        }
    }

    // getters and setters

    public int getLeft() {
        return 0;
    }

    public void setResult(int i) {
    }

}