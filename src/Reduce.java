public class Reduce {

    public static void main(String[] args) {
        int n = 100;
        int steps = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2; // If even, divide by 2
            } else {
                n = n - 1; // If odd, subtract 1
            }
            steps++; // Increment step counter
        }

        System.out.println("It takes " + steps + " steps to reach 0 from 100.");
    }
}

