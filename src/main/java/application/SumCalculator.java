package application;

public class SumCalculator {

    public int sum(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < number; i++) {
            counter++;
            sum += counter;
        }
        return sum;
    }
}
