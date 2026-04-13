/**
 * MyInteger.java
 * COP 2250 - Assignment 10
 * OO Thinking - Wrapper Class (Liang 10.3)
 *
 * Name:
 * Date:
 */
public class MyInteger {

    // STEP 1 - Declare private int field: value
    // private int value;

    private int value;

    // STEP 2 - Constructor
    // public MyInteger(int value) {
    //
    // }

    public MyInteger(int value) {
        this.value = value;
    }

    // STEP 3 - getValue()
    // public int getValue() {
    //
    // }

    public int getValue() {
        return value;
    }

    // STEP 4 - isEven() [instance]
    // public boolean isEven() {
    //
    // }

    public boolean isEven() {
        return value % 2 == 0;
    }

    // STEP 5 - isOdd() [instance]
    // public boolean isOdd() {
    //
    // }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    // STEP 6 - isPrime() [instance]
    // public boolean isPrime() {
    //
    // }

    public boolean isPrime() {
        return isPrime(value);
    }

    // STEP 7 - isEven(int n) [static]

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // STEP 8 - isOdd(int n)  [static]

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    // STEP 9 - isPrime(int n) [static]
    // public static boolean isEven(int n)  { ... }
    // public static boolean isOdd(int n)   { ... }
    // public static boolean isPrime(int n) { ... }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // STEP 10 - isEven(MyInteger m)  [static]

    public static boolean isEven(MyInteger m) {
        return isEven(m.getValue());
    }

    // STEP 11 - isOdd(MyInteger m)   [static]

    public static boolean isOdd(MyInteger m) {
        return isOdd(m.getValue());
    }

    // STEP 12 - isPrime(MyInteger m) [static]
    // Hint: call the int version using m.getValue()
    // public static boolean isEven(MyInteger m)  { ... }
    // public static boolean isOdd(MyInteger m)   { ... }
    // public static boolean isPrime(MyInteger m) { ... }

    public static boolean isPrime(MyInteger m) {
        return isPrime(m.getValue());
    }

    // STEP 13 - equals(int n)
    // public boolean equals(int n) {
    //
    // }

    public boolean equals(int n) {
        return this.value == n;
    }

    // STEP 14 - equals(MyInteger m)
    // public boolean equals(MyInteger m) {
    //
    // }

    public boolean equals(MyInteger m) {
        return this.value == m.getValue();
    }

    // STEP 15 - parseInt(String s) [static]
    // Do NOT use Integer.parseInt()
    // public static int parseInt(String s) {
    //
    // }

    public static int parseInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0');
        }
        return result;
    }

    // STEP 16 - parseInt(char[] chars) [static]
    // public static int parseInt(char[] chars) {
    //
    // }

    public static int parseInt(char[] chars) {
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result = result * 10 + (chars[i] - '0');
        }
        return result;
    }

    public static void main(String[] args) {
        // Uncomment as you implement each step
        // MyInteger m1 = new MyInteger(7);
        // MyInteger m2 = new MyInteger(4);

        // System.out.println("Value: " + m1.getValue());
        // System.out.println("isEven (instance): " + m1.isEven());
        // System.out.println("isOdd (instance): " + m1.isOdd());
        // System.out.println("isPrime (instance): " + m1.isPrime());
        // System.out.println("isEven(int 4): " + MyInteger.isEven(4));
        // System.out.println("isOdd(int 7): " + MyInteger.isOdd(7));
        // System.out.println("isPrime(int 7): " + MyInteger.isPrime(7));
        // System.out.println("isEven(MyInteger m2): " + MyInteger.isEven(m2));
        // System.out.println("equals(int 7): " + m1.equals(7));
        // System.out.println("equals(MyInteger m2): " + m1.equals(m2));
        // System.out.println("parseInt(String): " + MyInteger.parseInt("1234"));
        // System.out.println("parseInt(char[]): " + MyInteger.parseInt(new char[]{'5','6','7'}));

        MyInteger m1 = new MyInteger(7);
        MyInteger m2 = new MyInteger(4);

        System.out.println("Value: " + m1.getValue());
        System.out.println("isEven (instance): " + m1.isEven());
        System.out.println("isOdd (instance): " + m1.isOdd());
        System.out.println("isPrime (instance): " + m1.isPrime());
        System.out.println("isEven(int 4): " + MyInteger.isEven(4));
        System.out.println("isOdd(int 7): " + MyInteger.isOdd(7));
        System.out.println("isPrime(int 7): " + MyInteger.isPrime(7));
        System.out.println("isEven(MyInteger m2): " + MyInteger.isEven(m2));
        System.out.println("equals(int 7): " + m1.equals(7));
        System.out.println("equals(MyInteger m2): " + m1.equals(m2));
        System.out.println("parseInt(String): " + MyInteger.parseInt("1234"));
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(new char[]{'5','6','7'}));

    }
}
