/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class HRCurrencyFormatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val = sc.nextDouble();
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Currency cur = Currency.getInstance(Locale.);
        nf.setCurrency(cur);
        String formatted = nf.format(val);
        System.out.println(formatted);
        sc.close();
    }
}
