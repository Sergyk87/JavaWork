class Recursion {
    public static void main(String[] args) {
        // System.out.println(factorial (5));
        System.out.println(fib(6));

        int f_prev_prev = 0;
        int f_prev = 1;
        for (int i = 1; i < 6; i++) { // O(N)
            int f_next = f_prev + f_prev_prev;
            f_prev_prev = f_prev;
            f_prev = f_next;
        }
        System.out.println(f_prev);
    }

    // 1. Должен быть аругумент. Он будет меняться
    // 2. Дно рекурсии
    // 3. Полезное действие
    // (1 * 2 * 3 * ... * (n-1)) * n
    private static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    // f0 = 0
    // f1 = 1
    // f(n) = f(n-1) + f(n-2)
    private static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}