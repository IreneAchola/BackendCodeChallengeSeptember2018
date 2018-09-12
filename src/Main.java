import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Calculations calcs;

    public static void main(String[] args)
    {
        calcs = new Calculations();
        Scanner scanner =  new Scanner(System.in);

        String yes;
        do{
            evaluateCalculations();
            System.out.println("Enter 'y' to repeat operation: ");
            yes = scanner.next();
        }while (yes.equals("y") || yes.equals("Y"));
    }

    public static void evaluateCalculations()
    {
        Scanner scanner =  new Scanner(System.in);

        BigInteger nPrimes, nFactorials;
        do {
            System.out.println("Enter a positive integer, n,  to evaluate Primes between 0 and n: ");
            nPrimes = scanner.nextBigInteger();
        }while (nPrimes.compareTo(BigInteger.ONE)<0);
        listPrimes(nPrimes);
        do {
            System.out.println("Enter a positive integer to evaluate Factorials of integers between 0 and n: ");
            nFactorials = scanner.nextBigInteger();
        }while (nFactorials.compareTo(BigInteger.ONE) < 0);
        listFactorials(nFactorials);

    }

    public static void listPrimes(BigInteger n)
    {
        ArrayList<BigInteger>  listOfPrimes = calcs.primeNumbersToN(n);
        calcs.displayArraylist(listOfPrimes);
    }

    public static void listFactorials(BigInteger f)
    {
        ArrayList<BigInteger>  listOfFactorials = calcs.nFactorials(f);
        calcs.displayArraylist(listOfFactorials);
    }

}
