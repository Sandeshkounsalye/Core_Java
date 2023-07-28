package Demos15;

import java.util.Arrays;

public class ProblemSolution {
    public static int solution(int N, int[] A, int X) {
        int sumOfPrimeNumbers = 0;
        for (int i = 0; i < N; i++) {
            if (isPrime(A[i])) {
                sumOfPrimeNumbers += A[i];
            }
        }
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = Math.abs(A[i] - sumOfPrimeNumbers);
        }
        int[] C = new int[N];
        int countC = 0;
        for (int i = 0; i < N; i++) {
            if (!isPrime(B[i])) {
                C[countC++] = B[i];
            }
        }
        if (countC == 0) {
            return -1;
        }
        Arrays.sort(C, 0, countC);
        int countSubArrays = 0;
        for (int i = 0; i < countC; i++) {
            int sumSubArray = C[i];
            countSubArrays++;
            for (int j = i + 1; j < countC; j++) {
                sumSubArray += C[j];
                if (sumSubArray >= X) {
                    break;
                }
                countSubArrays++;
            }
        }
        return countSubArrays;
    }

    private static boolean isPrime(int n) {
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
}


