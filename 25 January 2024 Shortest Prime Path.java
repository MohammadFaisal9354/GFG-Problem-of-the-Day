//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution {
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private HashSet<Integer> getAdjacentPrimes(int num, HashSet<Integer> primesSet) {
        HashSet<Integer> primes = new HashSet<>();
        String numStr = Integer.toString(num);
        for (int i = 0; i < 4; i++) {
            for (int d = 0; d < 10; d++) {
                if (i == 0 && d == 0) {
                    continue;
                }
                StringBuilder newNumStr = new StringBuilder(numStr);
                newNumStr.setCharAt(i, (char) ('0' + d));
                int newNum = Integer.parseInt(newNumStr.toString());

                if (isPrime(newNum) && primesSet.contains(newNum)) {
                    primes.add(newNum);
                }
            }
        }

        return primes;
    }

    public int solve(int num1, int num2) {
        if (num1 == num2) {
            return 0;
        }

        HashSet<Integer> primesSet = new HashSet<>();
        for (int i = 1000; i < 10000; i++) {
            if (isPrime(i)) {
                primesSet.add(i);
            }
        }
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(num1);
        visited.add(num1);
        int distance = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int currentNum = queue.poll();
                if (currentNum == num2) {
                    return distance;
                }
                HashSet<Integer> adjacentPrimes = getAdjacentPrimes(currentNum, primesSet);
                for (int prime : adjacentPrimes) {
                    if (!visited.contains(prime)) {
                        visited.add(prime);
                        queue.add(prime);
                    }
                }
            }
            distance++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num1 = 1033;
        int num2 = 8179;
        int result = solution.solve(num1, num2);
        System.out.println(result); 
    }
}

//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int num1=Integer.parseInt(input_line[0]);
            int num2=Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.solve(num1,num2));
        }
    }
}
// } Driver Code Ends
