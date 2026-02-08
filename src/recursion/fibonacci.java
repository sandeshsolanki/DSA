package recursion;

public class fibonacci {
    public static int fib(int n)
    {
        if (n == 1 || n == 2)
        {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int N = 10;
        for (int i=1; i<=N; i++)
        {
            System.out.print(fib(i) + " ");
        }
    }
}
