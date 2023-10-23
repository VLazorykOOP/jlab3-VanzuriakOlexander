package Task3;

class Complex implements Pair<Double> {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public Double getFirst() {
        return real;
    }

    @Override
    public Double getSecond() {
        return imaginary;
    }

    @Override
    public Pair<Double> sum(Pair<Double> other) {
        double sumReal = this.real + other.getFirst();
        double sumImaginary = this.imaginary + other.getSecond();
        return new Complex(sumReal, sumImaginary);
    }

    @Override
    public Pair<Double> sub(Pair<Double> other) {
        double subReal = this.real - other.getFirst();
        double subImaginary = this.imaginary - other.getSecond();
        return new Complex(subReal, subImaginary);
    }

    @Override
    public Pair<Double> mult(int number) {
        double multReal = this.real * number;
        double multImaginary = this.imaginary * number;
        return new Complex(multReal, multImaginary);
    }

    @Override
    public Pair<Double> div(int number) {
        double divReal = this.real / number;
        double divImaginary = this.imaginary / number;
        return new Complex(divReal, divImaginary);
    }

    @Override
    public String toString() {
        return real + " " + imaginary ;
    }
}