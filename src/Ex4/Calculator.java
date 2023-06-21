package Ex4;

public class Calculator {

    public double add(double a, double b) {
        return a + b;

    }

    public double sub(double a, double b) {
        return a - b;

    }

    public double mul(double a, double b) {
        return a * b;

    }

    public void div(double a, double b) {
        try {
            if (b == 0 ) {
                throw new Exception("на 0 делить нельзя");
            }else {
                double res = a / b;
                System.out.println(res);
            }
        } catch (Exception e ) {
            System.out.println(e);
        }

    }
}

