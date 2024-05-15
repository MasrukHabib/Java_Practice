import java.util.Random;

class MyException extends Exception {
    private int iteration;

    public MyException(int iteration) {
        this.iteration = iteration;
    }

    public int getIteration() {
        return iteration;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throwExceptionAtRandomIteration();
        } catch (MyException e) {
            System.out.println("Exception occurred at iteration: " + e.getIteration());
        }
    }

    public static void throwExceptionAtRandomIteration() throws MyException {
        Random random = new Random();
        int maxIterations = 10; // Number of iterations in the for loop
        for (int i = 1; i <= maxIterations; i++) {
            if (random.nextBoolean()) {
                throw new MyException(i);
            }
        }
        System.out.println("\n name:\n Enrollment:\n Section: \n lab-batch:");
    }

}
