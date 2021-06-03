import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class newflames {

    public static void main(String args[]) {
        String name1, name2;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the first name:");
        name1 = sc.nextLine();
        System.out.printf("Enter the second name:");
        name2 = sc.nextLine();

        String lowname1, lowname2;

        lowname1 = name1.toLowerCase();
        lowname2 = name2.toLowerCase();

        char[] name1ar = name1.toCharArray();
        char[] name2ar = name2.toCharArray();

        for (int i = 0; i < name1ar.length; i = i + 1) {
            for (int j = 0; j < name1ar.length; j = j + 1) {

                if (name1ar[i] == name2ar[j]) {
                    System.out.println("1");
                } else {
                    System.out.println(name1ar[i] + "  and  " + name2ar[i]);
                }

            }

        }

    }

}
