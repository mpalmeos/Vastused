/**
 * Created by Maie on 17/01/2017.
 */

import javafx.scene.Node;

import java.util.ArrayList;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */

public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        ArrayList naide2 = new ArrayList();
        int arv;
        int number;

        for (int i = 0; i < naide.length; i++) {
            arv = naide[i];
            if (arv != 3){
                naide2.add(arv);
            }
        }
        System.out.println(naide2);

        for (int i = 0; i < naide2.size(); i++) {
            for (int j = 1; j < naide2.size(); j++) {
                if (naide2.get(i) == naide2.get(j)){
                    System.out.println("Korduv arv on " + naide2.get(i));
                }
            }
        }
    }
}
