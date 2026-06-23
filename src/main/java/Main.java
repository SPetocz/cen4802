public class Main {

     /**
     * Main entry point for the application.
     * <p>
     * Starts by passing n into the fibonacci method, and then prints out the result.
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args){
        int n = 15;
        int term = fibonacci(n);
        System.out.println("\nThe " + n + "th term of the Fibonacci sequence is " + term + ".");
    }

    /**
     * Recursive method to obtain nth term of Fibonacci Sequence.
     * <p>
     * Starts by checking base cases and then recursively calling itself.
     * @param n The wanted nth term of Fibonacci Sequence to be returned by method.
     * @return The value of nth term of Fibonacci Sequence.
     */
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }

}