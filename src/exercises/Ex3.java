package exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//Не обязательно. Написать метод, который переводит число из римского формата записи в арабский.
//        Например, MMXXII = 2022

public class Ex3 {
    private static Map<Integer, String> dict = Stream.of(new Object[][]{
            {1, "I"},
            {2, "II"},
            {3, "III"},
            {4, "IV"},
            {5, "V"},
            {6, "VI"},
            {7, "VII"},
            {8, "VIII"},
            {9, "IX"},
            {10, "X"},
            {20, "XX"},
            {30, "XXX"},
            {40, "XL"},
            {50, "L"},
            {60, "LX"},
            {70, "LXX"},
            {80, "LXXX"},
            {90, "XC"},
            {100, "C"},
            {200, "CC"},
            {300, "CCC"},
            {400, "CD"},
            {500, "D"},
            {600, "DC"},
            {700, "DCC"},
            {800, "DCCC"},
            {900, "CM"},
            {1000, "M"},
            {2000, "MM"},
            {3000, "MMM"},
            {4000, "MV"},
            {5000, "V"},
            {6000, "VM"},
            {7000, "VMM"},
            {8000, "VMMM"},
            {9000, "MX"},
            {10000, "X"},
            {20000, "XX"},
            {30000, "XXX"},
            {40000, "XL"},
            {50000, "L"},
            {60000, "LX"},
            {70000, "LXX"},
            {80000, "LXXX"},
            {90000, "XC"},
            {100000, "C"},
            {200000, "CC"},
            {300000, "CCC"},
            {400000, "CD"},
            {500000, "D"},
            {600000, "DC"},
            {700000, "DCC"},
            {800000, "DCCC"},
            {900000, "CM"},
            {1000000, "M"}

    }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));


    //new HashMap<Integer, String>();
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число арабскими цифрами (например, 122): ");
        int numArabic = scan.nextInt();
        StringBuilder numRome = new StringBuilder();
        int pow = 1;
        while (numArabic != 0) {
            numRome.insert(0, dict.get((Integer)numArabic % 10 * pow));
            numArabic /= 10;
            pow*=10;
        }
        System.out.println(numRome.toString());
    }
}
