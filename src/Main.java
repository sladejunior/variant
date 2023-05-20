import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Scanner scanner = new Scanner(System.in);
//         int x = scanner.nextInt();
//         int eps = scanner.nextInt();
//         int k = 0;
//
//         double javob1 = 0;
//         double javob2 =0;
//          while (Math.abs(javob2-javob1)>eps){
//              javob1 = k+((Math.pow(-1,k+1)*k*x)/
//          }


    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder chAt = new StringBuilder();
        String pref1 = "";
        String pref2 = "";
        for (int i = 0; i < strs.length - 1; i++) {
            pref1 = strs[i];
            pref2 = strs[i + 1];
            if (pref1.length() >= pref2.length()) {
                for (int j = 0; j < pref2.length(); j++) {
                    if (
                            pref1.charAt(j) == pref2.charAt(j)
                    ) {
                        chAt.append(pref1.charAt(j));
                    } else break;
                }
            } else {
                for (int j = 0; j < pref1.length(); j++) {
                    if (
                            pref1.charAt(j) == pref2.charAt(j)
                    ) {
                        chAt.append(pref1.charAt(j));
                    }else break;
                }
            }
        }
        return chAt.toString();
    }
}