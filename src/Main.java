import java.util.Scanner;

public class Main {
    // userInput - to input the number of exercise
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();

        switch (userInput) {
            case "ex1" -> {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                int min = Problem1.findMin(arr, n);
                System.out.println(min);
            }
            case "ex2" -> {
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                }
                double average = Problem2.calculateAverage(arr, n);
                System.out.println(average);
            }
            case "ex3" -> {
                int n = sc.nextInt();
                boolean prime = Problem3.isPrime(n, 2);
                if (prime) {
                    System.out.println(n + " Prime");
                }else {
                    System.out.println(n + " Composite");
                }
            }
            case "ex4" -> {
                int n = sc.nextInt();
                int factorial = Problem4.calculateFactorial(n);
                System.out.println(factorial);
            }
            case "ex5" -> {
                int n = sc.nextInt();
                int fibonacci = Problem5.calculateFibonacci(n);
                System.out.println(fibonacci);
            }
            case "ex6" -> {
                int n = sc.nextInt();
                int a = sc.nextInt();
                int power = Problem6.calculatePower(n, a);
                System.out.println(power);
            }
            case "ex7" -> {

            }
            case "ex8" -> {

            }
            case "ex9" -> {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int binomial = Problem9.calculateBinomialCoefficient(n, k);
                System.out.println(binomial);
            }
            case "ex10" -> {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int gcd = Problem10.calculateGCD(a, b);
                System.out.println(gcd);
            }
            default -> System.out.println("Invalid input!");
        }
    }
}