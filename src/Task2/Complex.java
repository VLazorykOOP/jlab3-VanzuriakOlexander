package Task2;

class Complex extends Pair<Double> {
    public Complex(double real, double imaginary) {
        super(real, imaginary);
    }

    @Override
    public Pair<Double> sum(Pair<Double> other) {
        double sumReal = this.first + other.first;
        double sumImaginary = this.second + other.second;
        return new Complex(sumReal, sumImaginary);
    }

    @Override
    public Pair<Double> sub(Pair<Double> other) {
        double subReal = this.first - other.first;
        double subImaginary = this.second - other.second;
        return new Complex(subReal, subImaginary);
    }

    @Override
    public Pair<Double> mult(int number) {
        double multReal = this.first * number;
        double multImaginary = this.second * number;
        return new Complex(multReal, multImaginary);
    }

    @Override
    public Pair<Double> div(int number) {
        double divReal = this.first / number;
        double divImaginary = this.second / number;
        return new Complex(divReal, divImaginary);
    }

    @Override
    public String toString() {
        return first + " " + second ;
    }
}