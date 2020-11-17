import java.io.*;

/*
** Question 1 : Ecrire en java une classe Tableau ayant pour attribut un tableau d’entiers. 
*/
public class Tableau {
	//Ajouter comment pour tester
    int tailleTableau = 0;
    static int[] tableauEntier;
    public static void main(String [] args) {
        //Juste pour tester le constructeur par default
        Tableau table1 = new Tableau();
        //Appel de la métode d'affichage
        table1.afficherTableau(tableauEntier);

        //Utilisation du constructeur avec parametre
        Tableau table2 = new Tableau(10);
        //Appel de la métode d'affichage
        table2.afficherTableau(tableauEntier);

        
        /*
        Test avec un tableau de 400 cases
        Tableau table3 = new Tableau(400);
        table3.affichtab(tableauEntier);
        */ 
    }

    /*
    Constructeur par défaut donc pas de type de retour
    Porte le même nom que la classe
    */
    public Tableau(){
        System.out.println("### Tableau sans parametres ###");
        tableauEntier = new int[]{0,0,0,0,0};
    }

    /*
    TODO : Le constructeur de cette classe devra initialiser le tableau et le remplir avec des entiers positifs tirés au hasard (entre 0 et 99). 
    TODO : La taille du tableau sera passée en paramètre au constructeur.
    */
    /*
    Constructeur surchargé avec le paramètre tailleTableau
    */
    public Tableau(int tailleTableau){
        /*
        La fonction Math.random() renvoie un nombre flottant pseudo-aléatoire compris dans l'intervalle [0, 1[ (ce qui signifie que 0 est compris dans l'intervalle mais que 1 en est exclu)
        On a donc ici un chiffre entre 0 et 99.
        (int) permet de cast le double en int renvoyé par la méthode Math.random en faisant un tronkage donc 98.8345763 donnera 98.
        */
        System.out.println("### Tableau avec parametres ###");
        tableauEntier = new int[tailleTableau];
        int compteur = 0;
        while(compteur < tailleTableau){
            int randomInt = (int)(Math.random() * 100);
            tableauEntier[compteur] = randomInt;
            compteur++;
        }
    }

    /*
    TODO : Question 2 : Ecrire une méthode pour cette classe permettant d’afficher le tableau.

    Correspond au meme type while-if :

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
    */
    void afficherTableau(int[] tabToBeScan){
        for(int i  : tabToBeScan){
            System.out.println(i);
        }
    }
    /* 
    Une autre facon de faire l'affichage des valeurs
    public static void affichtab(int[] tab){
        System.out.println("Affichage grace a la boucle while : ");

        // compte est un compteur entier soit (int) qui commence a 0 soit (= 0)

        int compte = 0;
        while(compte < tab.length){
             
            +compte+ correspond aux case du tableau 
            +tab[compte] aux differentes valeur generé aleatoirement et qui sera affiché
            
            System.out.println("La valeur a l'index "+compte+" est : "+tab[compte]);    
            compte++;
        }
        */

    //TODO :  Question 3 : Ecrire une method pour cette class de Tri_minimum

    int getMin(int[] tableauEntier){
        int min = 0;
        int compteur2 = 0;
        while (compteur2 < tableauEntier.length){
            if(tableauEntier[compteur2] < min){
                min = tableauEntier[compteur2];
            }
        compteur2++;
        }   
        return min;
    }

}
