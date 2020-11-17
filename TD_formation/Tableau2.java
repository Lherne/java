import java.io.*;
import java.lang.management.GarbageCollectorMXBean;
import java.time.MonthDay;

import jdk.javadoc.internal.doclets.formats.html.markup.Table;

//class toujours avec une maj
public class Tableau2 { 

    public static void main(String [] args) {
        Tableau2 jd = new initTableau2(10);
        int[] table = jd.initTableau2(10);
        int vMax = 0;
        int vMin = 0;
        vMax = jd.getMax();
        vMin = jd.getMin();
    }
    //taille
    int tailleTableau;

    //method constru toujours minuscule obligatoire 
    Tableau2(int _tailleTableau)
    {
        int[] monTableau = new int[_tailleTableau];
        tailleTableau = _tailleTableau;
        int compteur = 0;
        while (compteur < tailleTableau){
            int randomNum = (int)(Math.random() * 100);  // 0 a 99
            monTableau[compteur] = randomNum;
            System.out.println("La valeur a l'index "+compteur+" du tableau monTableau est : "+monTableau[compteur]);
            compteur++;
        }
    }

    int[] initTableau2(int _tailleTableau)
    {
        int[] monTableau = new int[_tailleTableau];
        tailleTableau = _tailleTableau;
        int compteur = 0;
        while (compteur < tailleTableau){
            int randomNum = (int)(Math.random() * 100);  // 0 a 99
            monTableau[compteur] = randomNum;
            System.out.println("La valeur a l'index "+compteur+" du tableau monTableau est : "+monTableau[compteur]);
            compteur++;
        }
        return monTableau;
    }

    int getMax(int[] table){
        int max = 0;
        int compteur2 = 0;
        while (compteur2 < table.length){
            if(table[compteur2] > max){
                max = table[compteur2];
            }
        compteur2++;
        }
        return max;
    }

    int getMin(int[] table){
        int min = 0;
        int compteur3 = 0;
        while (compteur3 < table.length){
            if(table[compteur3] < min){
                min = table[compteur3];
            }
        compteur3++;
        }   
        return min;
    }
}