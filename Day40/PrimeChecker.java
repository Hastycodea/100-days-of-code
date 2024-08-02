package Day40;

import java.util.List;

public class PrimeChecker implements Runnable{
    private int number;
    private List<Integer> primeNumbers;

    public PrimeChecker(int number, List<Integer> primeNumbers) {
        this.number = number;
        this.primeNumbers = primeNumbers;
    }

    @Override
    public void run() {
        if (isPrime(number)) {
            synchronized (primeNumbers) {
                primeNumbers.add(number);
            }
        }
    }

    private boolean isPrime(int number) {
        if(number == 0 || number == 1) return false;
        for(int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
