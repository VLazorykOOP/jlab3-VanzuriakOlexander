package Task2;

abstract class Pair<T> {
    protected T first;
    protected T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public abstract Pair<T> sum(Pair<T> other);
    public abstract Pair<T> sub(Pair<T> other);
    public abstract Pair<T> mult(int number);
    public abstract Pair<T> div(int number);

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}