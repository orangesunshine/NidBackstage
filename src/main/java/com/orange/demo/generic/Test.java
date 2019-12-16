package com.orange.demo.generic;

public class Test {
    private static int COUNT_MAX_RECURSIVE = 3;

    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT =
            "cat cat cat cattie cat";

    public static void main(String args[]) {
        int combination = combination(5, 2);
        System.out.println("combination = " + combination);
    }

    public static int combination(int m, int n) {
        if (n != 0 && m != 0) {
            if (n > m) {
                return 0;
            } else {
                if (n > m / 2) {
                    n = m - n;
                }

                double a = 0.0D;
                int temp = 0;
                int i;
                for (i = m; i >= m - n + 1; --i) {
                    a += Math.log((double) i);
                    temp += i;
                }

                System.out.println("temp = " + temp);

                for (i = n; i >= 1; --i) {
                    a -= Math.log((double) i);
                    temp -= i;
                }
                System.out.println("temp = " + temp);
                a = Math.exp(a);
                System.out.println("a = " + a);
                return (int) Math.round(a);
            }
        } else {
            return 1;
        }
    }


    public static int hashCode(long a[]) {
        if (a == null)
            return 0;

        int result = 1;
        for (long element : a) {
            System.out.println("element = " + Long.toBinaryString(element));
            long ret = element >>> 32;
            System.out.println("ret = " + ret);
            int elementHash = (int) (element ^ (element >>> 32));
            System.out.println("elementHash = " + elementHash);
            result = 31 * result + elementHash;
        }

        return result;
    }
}
