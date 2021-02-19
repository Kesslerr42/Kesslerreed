package exam;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
int range = 100000000;
        
        ArrayList<Integer> arl = new ArrayList<Integer>();
        arl.add(2);
        int numberOfPrimes = 1;
        
        long start = System.currentTimeMillis();
        
        for (int check = 3; check < range; check = check+2 ) {
            //System.out.println("number to check: " + check);
            if(isNumberPrime(check, arl))
            {
                //System.out.println("Prime! " + check);
                arl.add(check);
                numberOfPrimes++;
            }        
        }
        System.out.println("time: " + (System.currentTimeMillis() - start));
        System.out.println("Number of primes: " + numberOfPrimes);
    }

    private static boolean isNumberPrime(int check, ArrayList<Integer> arl) {
        for(int index = 0; index < arl.size(); index++)
        {
            //System.out.println("Checking " + arl.get(index));
            if(0 ==(check % arl.get(index)))
            {
                return false;
            }
        }
        return true;
    }

}