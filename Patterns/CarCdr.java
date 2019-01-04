import java.util.ArrayList;
import java.util.List;

/**
 * Daily Coding Problems
 * cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair.
 * For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
 *
 *@author Arihant Jain
 */

public class CarCdr {
    public static void main(String[] args) {
        System.out.println(car(cons(3, 4)));
        System.out.println(cdr(cons(3, 4)));
    }

    private static List<Object> cons(int a, int b) {
        List<Object> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }

    private static Object car(List<Object> list) {
        return list.get(0);
    }

    private static Object cdr(List<Object> list) {
        return list.get(1);
    }
}
