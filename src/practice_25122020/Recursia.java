package practice_25122020;

public class Recursia {
    static int count7(int n) {
        if (n == 0) {// 1
            return 0;
        }
        if (n % 10 == 7) {// 1
            return 1 + count7(n / 10);// 1
        }
        return count7(n / 10);// 1
    }

    public int sumDigits(int n) {

        if (n == 0) {
            return 0;
        } else
            return n % 10 + sumDigits(n / 10);
    }

    static int strCount(String str, String sub) {
        // wcat, cattt
        if (str.length() < sub.length())
            return 0;
        String newStr = str.substring(0, sub.length());
        int count = 0;
        if (newStr.equals(sub)) {
            count++;
            str = str.substring(sub.length());
        } else {
            str = str.substring(1);
        }
        return count + strCount(str, sub);
    }

    static int strCountNew(String str, String sub) {
        if (str.length() < sub.length())
            return 0;
        if (str.substring(0, sub.length()).equals(sub))
            return 1 + strCountNew(str.substring(sub.length()), sub);
        else
            return strCountNew(str.substring(1), sub);
    }

    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat"));
    }
}
