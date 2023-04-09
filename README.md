About Main class:
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // n, k, a, b - input numbers
    // arr - array
    // s - string
    // userInput - to input the number of exercise
    // min - minimum in the array
    // average - average of array elements
    // prime - checks is n is prime or composite
    // factorial - factorial of n
    // fibonacci - calculates n-th of term of fibonacci series
    // power - calculates n to the power of a
    //
    // digit - checks that is string consist of all digits
    // binomial - calculates the binomial coefficient of n and k
    // gcd - calculates gcd of a and b
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
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                } int[] reverse = Problem7.reverseArray(arr, 0, n-1);
                System.out.println(Arrays.toString(reverse).replace(",", "").replace("[", "").replace("]", "").trim());
            }
            case "ex8" -> {
                String s = sc.next();
                boolean digit = Problem8.isAllDigits(s);
                if (digit) {
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
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

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

It takes user input to choose one of the ten exercises and then performs the corresponding calculation by calling the appropriate method from the other classes 
called Problem1, Problem2, Problem3, Problem4, Problem5, Problem6, Problem7, Problem8, Problem9, and Problem10. In the main method, a Scanner object is created to read 
input from the console. The input is then stored in the userInput variable. The switch statement is used to execute a particular case based on the user input.
Each case corresponds to one of the ten exercises, and each case block contains code that reads input from the user, calls the corresponding method from the other 
classes, and then prints the result. For example, if the user enters "ex1", the code reads an integer n and an array of n integers from the console, calls the findMin 
method from Problem1 to find the minimum value in the array, and then prints the result.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

About Problem1 class:

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Problem1 {
    // n - length of array
    // arr - array
    // min - minimum number in the array
    // return - returns minimum number in the array
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            int min = findMin(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

A class called Problem1 with a static method findMin that takes an array of integers arr and its length n as input and returns the minimum value in the array.
The method uses a recursive approach to find the minimum value. If the array has only one element, the method simply returns that element. Otherwise, it recursively 
calls itself with the array of length n-1 and assigns the minimum value found to the variable min. The method then returns the minimum value between min and the last 
element in the array arr[n-1], using the Math.min() method.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

About Problem2 class:

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Problem2 {
    // n - length of array
    // arr - array
    // average - average of array elements
    // return - returns average of array elements
    public static double calculateAverage(int[] arr, int n){
        if (n==0){
            return 0;
        }else{
            return (arr[n-1] + (n-1)*calculateAverage(arr, n-1))/n;
        }
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

This code defines a method named calculateAverage() that takes an integer array arr and its length n as parameters, and returns the average of all the elements of the 
array as a double value. The method uses recursion to compute the average of the elements in the array. It first checks if the length of the array is 0. If the length 
is 0, the method returns 0. Otherwise, it uses the formula (arr[n-1] + (n-1)*calculateAverage(arr, n-1))/n to calculate the average of the first n-1 elements of the 
array and adds it to the value of the n-1-th element of the array. It then divides this sum by n to get the average of all the elements in the array. The formula 
arr[n-1] + (n-1)*calculateAverage(arr, n-1) recursively calculates the sum of the first n-1 elements of the array. The (n-1) term in the formula represents the number 
of elements in the array excluding the n-th element, and the calculateAverage(arr, n-1) term recursively calculates the average of these elements. Finally, the method 
returns the computed average.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

About Problem3 class:

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Problem3 {
    // n - input number
    // i - default number for checking conditions, which equals to 2
    // isPrime - function that checks is n is prime or not
    public static boolean isPrime(int n, int i) {
        if (n < 2) {
            return false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

The purpose of the isPrime method is to determine whether a given input number n is prime or not. The method takes two parameters, n and i, where n is the input number
to be checked and i is an integer value used as a counter for checking whether n is divisible by any number other than 1 and itself. The implementation of the isPrime 
method starts by checking if the input number n is less than 2. If n is less than 2, the method immediately returns false, since 1 is not considered a prime number.
Next, the method checks whether n is divisible by i (i.e., whether n is not a prime number). If n is divisible by i, the method returns false, since n is not a prime 
number. If n is not divisible by i, the method checks whether i squared is greater than n. If i squared is greater than n, then all possible factors of n have been 
checked, and the method returns true, indicating that n is a prime number. If i squared is not greater than n, the method recursively calls itself with the input 
parameters n and i+1. This continues the process of checking whether n is divisible by any number other than 1 and itself. The method will continue to recursively call
itself until all possible factors of n have been checked. Overall, this implementation of the isPrime method uses a recursive algorithm to check whether a given input 
number is prime. It checks for factors of n by incrementally increasing a counter i until i squared is greater than n or until a factor other than 1 and n has been 
found.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

About Problem4 class:

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class Problem4 {
    // n - input number
    // return - returns the factorial of n
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

The implementation uses recursion to compute the factorial of a given input. If the input "n" is zero, the method immediately returns 1 since 0! is defined to be 1. 
Otherwise, the method computes the factorial of "n-1" and multiplies it by "n" to obtain the factorial of "n".
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

About Problem5 class:

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Problem5 {
    // n - input number
    // return - returns  nth term in the Fibonacci series
    public static int calculateFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

The calculateFibonacci method takes an integer n as input and returns the nth term in the Fibonacci series. If n is equal to 0 or 1, the method simply returns n. 
Otherwise, the method recursively calls itself with n-1 and n-2 as arguments, adds the results, and returns the sum. For example, if we call calculateFibonacci(6), 
the method first checks if n is equal to 0 or 1, which it is not. So it calls itself with n-1 and n-2 as arguments: calculateFibonacci(5) and calculateFibonacci(4). 
The method continues to recursively call itself with smaller values of n until n is equal to 0 or 1. At this point, the method starts returning the results of the 
previous recursive calls, adding them together until it reaches the final result. In this example, calculateFibonacci(5) will return 5, calculateFibonacci(4) will 
return 3, and so on. The method will finally return the sum of calculateFibonacci(5) and calculateFibonacci(4), which is 8, which is the 6th number in the Fibonacci 
series.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

About Problem6 class:

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class Problem6 {
    // n - input number
    // a - power of n
    // return - returns n to the of a

    public static int calculatePower(int n, int a) {
        if (n == 0) {
            return 0;
        } else if (a == 0) {
            return 1;
        } else {
            return n * calculatePower(n, a - 1);
        }
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

A class Problem6 that contains a static method named calculatePower, which takes two integers n and a as input parameters and returns an integer. The method calculates the 
power of n raised to a using recursion. The first conditional statement checks if the base n is 0, in which case the result would always be 0, so it returns 0. The 
second conditional statement checks if the power a is 0. In this case, the result would always be 1 (any number raised to 0 is 1), so it returns 1. If none of the 
above conditions are met, then the method recursively calls itself by reducing the power a by 1 until a is equal to 0, and multiplies the result with n at each step. 
Finally, it returns the result obtained from the recursive calls.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

About Problem7 class:

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Problem7 {
    // i - starting element index
    // j - ending element index
    // arr - array
    // temp - local variable
    // return - returns array elements in reverse order
    public static int[] reverseArray(int[] arr, int i, int j){
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            reverseArray(arr, i+1, j-1);
        }
        return arr;
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

The purpose of the reverseArray method is to reverse the order of the elements in the input array between the indices i and j. It does this recursively by swapping the
elements at the i and j indices, and then recursively calling itself with i incremented by 1 and j decremented by 1. This continues until i is no longer less than j, 
at which point the method returns the reversed array. public static int[] reverseArray(int[] arr, int i, int j){: This line declares the reverseArray method with an 
integer array parameter arr, and two integer parameters i and j. if(i<j){: This line checks whether i is less than j. If it is, it means there are still elements in 
the input array that need to be swapped. int temp=arr[i];: This line creates a temporary variable named temp and sets it equal to the value of the element at index i.
arr[i]=arr[j];: This line sets the value of the element at index i equal to the value of the element at index j. arr[j]=temp;: This line sets the value of the element 
at index j equal to the value of the temporary variable temp, which is the original value of the element at index i. reverseArray(arr, i+1, j-1);: This line recursively
calls the reverseArray method with the same array (arr) and with i incremented by 1 and j decremented by 1. This will continue to swap elements until i is no longer 
less than j. return arr;: This line returns the reversed array once all the elements have been swapped.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

About Problem8 class:

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Problem8 {
    // s - string
    // firstChar - first symbol of string
    // isDigit - checks is the first symbol is digit
    // restDigits - checks is string is digit starting from the second symbol till the end
    // return - returns boolean value
    public static boolean isAllDigits(String s){
        if (s.isEmpty()){
            return true;
        }else {
            char firstChar = s.charAt(0);
            boolean isDigit = Character.isDigit(firstChar);
            boolean restDigits = isAllDigits(s.substring(1));
            return isDigit && restDigits;
        }
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

The aim of the isAllDigits method is to check whether all the characters in the input string are digits. It does this recursively by checking the first character 
of the input string, and then recursively calling itself with the remaining string (i.e., the input string with the first character removed).
public static boolean isAllDigits(String s){: This line declares the isAllDigits method with a string parameter s.
if (s.isEmpty()){: This line checks whether the input string s is empty. If it is, it means there are no characters to check, and the method returns true.
return true;: This line returns true if the input string is empty.
}else {: This line executes if the input string is not empty.
char firstChar = s.charAt(0);: This line gets the first character of the input string s and stores it in a variable named firstChar.
boolean isDigit = Character.isDigit(firstChar);: This line checks whether the first character of the input string is a digit. If it is, it sets isDigit to true. 
Otherwise, it sets isDigit to false.
boolean restDigits = isAllDigits(s.substring(1));: This line recursively calls the isAllDigits method with the input string s starting from the second character 
(s.substring(1)).
return isDigit && restDigits;: This line returns true if the first character of the input string is a digit (isDigit is true) and if the rest of the string is also all
digits (restDigits is true). Otherwise, it returns false.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

About Problem9 class:

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Problem9 {
    // basis: (n!)/(((n-k)!)*(k!))
    // n - input number
    // k - input number
    // return - returns binomial coefficient of n and k
    public static int calculateBinomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);
        }
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

The goal of the calculateBinomialCoefficient method is to calculate the binomial coefficient of n and k using a recursive algorithm. The binomial coefficient is the
number of ways k items can be selected from a set of n items, and is denoted by the symbol n choose k.
The algorithm used in the calculateBinomialCoefficient method is based on the following formula: n choose k = (n!)/(((n-k)!)*(k!)).
public static int calculateBinomialCoefficient(int n, int k) {: This line declares the calculateBinomialCoefficient method with two integer parameters n and k.
if (k == 0 || k == n) {: This line checks whether k is equal to 0 or n. If it is, it means that either all n items are selected (k=n) or none are selected (k=0), so 
the method returns 1.
return 1;: This line returns 1 if k is equal to 0 or n.
} else {: This line executes if k is not equal to 0 or n.
return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);: This line recursively calculates the binomial coefficient of n and k using
the formula n choose k = (n-1 choose k-1) + (n-1 choose k). It does this by calling the calculateBinomialCoefficient method with n-1 and k-1, and then adding the result
to the result of calling the calculateBinomialCoefficient method with n-1 and k. The recursion terminates when k is equal to 0 or n, at which point the method returns 1.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

About Problem10 class:

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class Problem10 {
    // a and b - input numbers
    // return - returns great common divisor of a and b
    public static int calculateGCD(int a, int b) {
        if (a == 0)
            return b;
        return calculateGCD(b % a, a);
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

The purpose of the calculateGCD method is to calculate the greatest common divisor (GCD) of a and b using a recursive algorithm. The greatest common divisor of two 
integers a and b is the largest integer that divides both a and b without leaving a remainder.
public static int calculateGCD(int a, int b) {: This line declares the calculateGCD method with two integer parameters a and b.
if (a == 0): This line checks whether a is equal to 0. If it is, it means that b is the GCD of a and b, so the method returns b.
return b;: This line returns b if a is equal to 0.
return calculateGCD(b % a, a);: This line recursively calculates the GCD of a and b using the Euclidean algorithm. The algorithm works as follows: if a divides b 
evenly (i.e., b % a == 0), then a is the GCD of a and b. Otherwise, the GCD of a and b is equal to the GCD of a and the remainder of b divided by a (i.e., b % a). 
This is what is calculated recursively by calling the calculateGCD method with b % a and a. The recursion terminates when a is equal to 0, at which point the method 
returns b.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

That's all🙌
