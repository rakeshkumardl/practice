package dsaProblem;

public class NumberPalindrom {
    public static void main(String[] args) {
    boolean isp = isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {

        int sum = 0;
        int r;
        int temp;
        temp = x;

        while (x > 0) {
            r = x % 10;
            sum = (sum * 10) + r;
            x = x / 10;

        }
        if (temp == sum) {
            System.out.println("Palindrom Number");
        } else {
            System.out.println("Not a Palindrom Number");

        }
        return false;
    }
}
