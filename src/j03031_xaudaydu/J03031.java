package j03031_xaudaydu;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J03031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int k = sc.nextInt();
            Set<Character> st = new TreeSet<>();
            for(int i=0;i<s.length();i++){
                st.add(s.charAt(i));
            }
            if((st.size()+k)>=26){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
