package others;

import java.util.HashMap;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(5));  //  1 1 2 3 5
        System.out.println(fib(6)); //  1 1 2 3 5 8
        System.out.println(fib(7));  //  1 1 2 3 5 8 13
        System.out.println(fib(8)); //  1 1 2 3 5 8 13 21
        System.out.println(fib(40)); //  1 1 2 3 5 8 13 21 ...102334155
        System.out.println(fib(48)); //  1 1 2 3 5 8 13 21 ...12586269025
        System.out.println();
        int a = 2147483647;
//        long fifty = 12586269025;
    }


    public static Long fib(long n){
        HashMap<Long, Long> memo = new HashMap<Long,Long>();
        if (memo.containsKey(n)) return memo.get(n);
        if (n<=2) return 1l;
        memo.put(n, fib(n-1)+fib(n-2));
        return memo.get(n);
    }
}
