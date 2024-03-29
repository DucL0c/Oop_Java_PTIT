package j07032_sothuannghichtrongfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class J07032 {
    public static boolean check(String s) {
        if (s.length() % 2 == 0 || s.length() == 1) {
            return false;
        }
        for (int i = 0; i <= s.length() / 2; i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                return false;
            }
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] f1 = new int[1000001];
        int[] f2 = new int[1000001];
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        for (Integer x : a) {
            if (check(x.toString())) {
                f1[x]++;
            }
        }
        sc = new ObjectInputStream(new FileInputStream("DATA2.in"));
        a = (ArrayList<Integer>) sc.readObject();
        for (Integer x : a) {
            if (check(x.toString())) {
                f2[x]++;
            }
        }
        int s = 0;
        for (int i = 0; i <= 1000000; i++) {
            if (f1[i] > 0 && f2[i] > 0) {
                System.out.println(i + " " + (f1[i] + f2[i]));
                s++;
            }
            if (s == 10) {
                break;
            }
        }
    }
}
