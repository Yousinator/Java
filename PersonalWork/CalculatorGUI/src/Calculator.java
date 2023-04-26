public class Calculator {

    private double num1, num2;

    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return num1 / num2;
    }

    public void setnum1(double num1) {
        this.num1 = num1;
    }

    public void setnum2(double num2) {
        this.num2 = num2;
    }

}
