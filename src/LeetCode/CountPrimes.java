package LeetCode;

public class CountPrimes {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] isPrime = new boolean[n];
        isPrime [0] = false;
        isPrime [1] = false;
        int count = 0;
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            for (int j = i * i; j < n; j += i) {
                isPrime [j] = false;
            }

        }
        for (int i = 2; i < n; i++) {
            if(isPrime[i] == true) {
                count ++;
            }
        }
        return count;
    }
}
