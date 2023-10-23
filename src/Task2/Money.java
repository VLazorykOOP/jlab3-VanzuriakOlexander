package Task2;

class Money extends Pair<Integer> {
    public Money(int dollars, int cents) {
        super(dollars, cents);
    }

    @Override
    public Pair<Integer> sum(Pair<Integer> other) {
        int sumDollars = this.first + other.first;
        int sumCents = this.second + other.second;
        if (sumCents >= 100) {
            sumDollars += sumCents / 100;
            sumCents %= 100;
        }
        return new Money(sumDollars, sumCents);
    }

    @Override
    public Pair<Integer> sub(Pair<Integer> other) {
        int subDollars = this.first - other.first;
        int subCents = this.second - other.second;
        if (subCents < 0) {
            subDollars -= 1;
            subCents += 100;
        }
        return new Money(subDollars, subCents);
    }

    @Override
    public Pair<Integer> mult(int number) {
        int multDollars = this.first * number;
        int multCents = this.second * number;
        if (multCents >= 100) {
            multDollars += multCents / 100;
            multCents %= 100;
        }
        return new Money(multDollars, multCents);
    }

    @Override
    public Pair<Integer> div(int number) {
        int divDollars = this.first / number;
        int divCents = this.second / number;
        return new Money(divDollars, divCents);
    }

    @Override
    public String toString() {
        return "$" + first + "." + second;
    }
}