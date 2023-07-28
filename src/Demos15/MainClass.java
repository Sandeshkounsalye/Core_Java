package Demos15;

    import java.util.*;

    public class MainClass {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = s.nextInt();
            }
            int X = s.nextInt();
            ProblemSolution problemSolution = new ProblemSolution() ;
            System.out.print(problemSolution.solution(N, A, X));
        }}

