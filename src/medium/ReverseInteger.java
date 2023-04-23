package medium;

public class ReverseInteger {

    public int reverse(int x) {

        if(x == 0) {
            return 0;
        }

        String number = new StringBuilder(String.valueOf(x)).reverse().toString();

        if(number.startsWith("0")) {
            number = number.substring(1);
        }

        if(x < 0) {
            number = number.substring(0, number.length() - 1);
            number = "-" + number;
        }

        if(Long.parseLong(number) > Integer.MAX_VALUE || Long.parseLong(number) < Integer.MAX_VALUE) {
            return 0;
        } else {
            return Integer.parseInt(number);
        }
    }
}
