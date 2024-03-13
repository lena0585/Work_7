public class Main {
    public static void main(String[] args) {
        Calculator calculator = new ComplexCalculator();
        Logger logger = new Logger();

        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);

        ComplexNumber sum = calculator.add(a, b);
        logger.log("Sum of " + a + " and " + b + " is " + sum);

        ComplexNumber product = calculator.multiply(a, b);
        logger.log("Product of " + a + " and " + b + " is " + product);

        ComplexNumber quotient = calculator.divide(a, b);
        logger.log("Quotient of " + a + " and " + b + " is " + quotient);
    }
}
