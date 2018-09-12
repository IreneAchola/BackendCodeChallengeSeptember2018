
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Calculations {


    private BigInteger oneBigint = new BigInteger("1");
    private BigInteger zeroBigint = new BigInteger("0");
    private BigInteger twoBigint = new BigInteger("2");
    public Calculations() {
    }

    //A method to display Arraylists
    public void displayArraylist(ArrayList<BigInteger> sourceList)
    {
        if ((sourceList.isEmpty()))
        {
            System.out.println("List is empty!");
        }
        else
        {
            for(int i = 0; i<sourceList.size(); i++)
            {
                BigInteger x = sourceList.get(i);
                System.out.print(x +" ");
            }
        }
        System.out.println();
    }
    //A function that takes an int n and returns a list of all prime numbers between 0 and n
    public ArrayList<BigInteger> primeNumbersToN(BigInteger n)
    {
        ArrayList<BigInteger> primeNums = new ArrayList<>();
        if(n.compareTo(new BigInteger("2"))>0)
        {
            for (BigInteger i = twoBigint; i.compareTo(n)<0;i=i.add(oneBigint))
            {
                if(isPrime(i))
                {
                    primeNums.add(i);
                }
            }
        }
        return primeNums;
    }
    private Boolean isPrime(BigInteger number)
    {
        if ((number.compareTo(oneBigint.add(BigInteger.ONE)))<0)
        {
            return false;
        }
        else if (number.equals(BigInteger.valueOf(2)) || number.equals(BigInteger.valueOf(3)))
        {
            return true;
        }
        else
        {
            BigInteger rootNumber = BigDecimal.valueOf(Math.sqrt(number.doubleValue())).toBigInteger();
            for (BigInteger i = twoBigint; i.compareTo(rootNumber.add(oneBigint))<0;i=i.add(oneBigint))
            {
                if((number.remainder(i)).equals(zeroBigint))
                {
                    return false;
                }
            }
            return true;
        }
    }

    //A function that takes an Int n and returns a List of all the factorials of the numbers between 0 and n inclusive


    public ArrayList<BigInteger> nFactorials(BigInteger n)
    {
        ArrayList<BigInteger> numberFactorials = new ArrayList<>();
        if(n.compareTo(zeroBigint)>0)
        {
            for(BigInteger i = oneBigint; i.compareTo(n)<0;i=i.add(oneBigint))
            {
                BigInteger nFact = nFactorial(i);
                numberFactorials.add(nFact);
            }
        }
        return numberFactorials;
    }
    private BigInteger nFactorial(BigInteger number)
    {
        BigInteger multiplier = new BigInteger("1");
        return computeFactorial(number,multiplier);
    }
    private BigInteger computeFactorial(BigInteger start, BigInteger result)
    {
        if(start.compareTo(zeroBigint)>0)
        {
            return computeFactorial(start.subtract(oneBigint), result.multiply(start));
        }
        return result;
    }

}
