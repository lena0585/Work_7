public class ComplexCalculator implements Calculator {
    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return a.add(b);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        return a.multiply(b);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        return a.divide(b);
    }
}

