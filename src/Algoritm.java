import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said alla keskmise iga grupi kohta?
 */
public class Algoritm {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(allaKeskmise(new int[]{19, 45, 55, 67, 89}));
        System.out.println(allaKeskmise(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(allaKeskmise(new int[]{21, 85, 45}));

    }

    // Siia meetodi sisse kirjuta lahendus.
    private static int allaKeskmise(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints [i] >60) {
                ints [i] = 60;
            }
            System.out.println(ints [i]);
        }
        System.out.println(Arrays.toString(ints));

        int l = 0;
        int summa = 0;

        while (l < ints.length) {
            summa = summa + ints[l];
            l = l + 1;
        }
        System.out.println(summa);

        double keskmine = summa/ints.length;
        System.out.println(ints.length);
        System.out.println(keskmine);

        int vastus = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints [i] < keskmine) {
                vastus++;
            }
        }
        return vastus;
    }

}
