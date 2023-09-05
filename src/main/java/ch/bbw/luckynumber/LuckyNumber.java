package ch.bbw.luckynumber;

import java.util.*;

/**
 * LuckyNumber
 * Fachklasse für das Berechnen von Glueckszahlen
 *
 * @author Peter Rutschmann
 * @date 06.09.2021
 */
public class LuckyNumber {

    public int singleDice() {
        int value = 0;
        Random random = new Random();
        value = (random.nextInt(6) + 1);

        return value;
    }

    public List<Integer> doubleDice() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        list.add(random.nextInt(6) + 1);
        list.add(random.nextInt(6) + 1);
        return list;
    }

    public boolean trueOrFalse() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public Set<Integer> sixLottoNumbers() {
        Random random = new Random();
        Set<Integer> set = new HashSet<Integer>();
        while (set.size() < 6) {
            set.add(random.nextInt(42) + 1);
        }
        return set;
    }

    public String playingCard() {
        Random random = new Random();
        String card = "";
        //farbe
        if (random.nextBoolean()) {
            //rot
            if (random.nextBoolean()) {
                card = card + "Rot, Herz, ";
            } else {
                //Karo
                card = card + "Rot, Karo, ";
            }
        }else {
            //schwarz
             if (random.nextBoolean()) {
                 //Pik
                 card = card + "Schwarz, Pik, ";
             } else {
                 //Kreuz
                 card = card + "Schwarz, Kreuz, ";
                }
        }
        card = card + (random.nextInt(9)+2);
                return card;

    }

    public List<Integer> primeUpTo100() {
        List<Integer> list = new ArrayList<>();
        //Hier ergaenzen

        return list;
    }

    public int primeNextTo(int value) {
        //Hier ergaenzen

        return 0;
    }

    public List<Integer> triangleNumbersUpTo(int value) {
        List<Integer> list = new ArrayList<Integer>();
        //Hier ergaenzen

        return list;
    }
}
