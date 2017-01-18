/**
 * Created by Maie on 17/01/2017.
 */

import javafx.scene.Node;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */

public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        ArrayList naide2 = new ArrayList();
        int arv;
        ArrayList arv1 = new ArrayList();
        ArrayList arv5 = new ArrayList();
        ArrayList arv6 = new ArrayList();
        ArrayList arv7 = new ArrayList();

        for (int i = 0; i < naide.length; i++) {
            arv = naide[i];
            if (arv != 3){
                naide2.add(arv);
            }
        }
        System.out.println(naide2);

        for (int i = 0; i < naide2.size(); i++) {
            if (naide2.get(i) == "1") {
                arv1.add(i);
            } else if (naide2.get(i) == "5"){
                arv5.add(i);
            } else if (naide2.get(i) == "6"){
                arv6.add(i);
            }else if (naide2.get(i) == "7"){
                arv7.add(i);
            }
        }

        if (arv1.size() > arv5.size() && arv1.size() > arv6.size() && arv1.size() > arv7.size()){
            System.out.println(arv1);
        } else if (arv5.size() > arv1.size() && arv5.size() > arv6.size() && arv5.size() > arv7.size()){
            System.out.println(arv5);
        } else if (arv6.size() > arv5.size() && arv6.size() > arv1.size() && arv6.size() > arv7.size()){
            System.out.println(arv6);
        } else if (arv7.size() > arv5.size() && arv7.size() > arv6.size() && arv7.size() > arv1.size()){
            System.out.println(arv7);
        }
    }
}
