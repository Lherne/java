import java.io.*;

/*
** Question 1 : Ecrire en java une classe Tableau ayant pour attribut un tableau d’entiers. 
*/
public class TableauMax {
    int tailleTableau = 0;
    static int[] tableauEntier;
    public static void main(String [] args) {
        //Juste pour tester le constructeur par default
        TableauMax table1 = new TableauMax();

        //Utilisation du constructeur avec param
        TableauMax table2 = new TableauMax(5);

        //Appel de la métode d'affichage
        //table2.afficherTableau(tableauEntier);

        //Appel de la méthode de tri mini (du plus petit au plus grand)
        //int[] tabTrieMini = table2.triMinimum(tableauEntier);
        //System.out.println("### Tri mini ###");
        //table2.afficherTableau(tabTrieMini);

        //Appel de la méthode de tri maxi (plus grand au plus petit)
        int[] tabTrieMax = table2.triMaximum(tableauEntier);
        //System.out.println("### Tri maxi ###");
        //table2.afficherTableau(tabTrieMax);

        //Appel de la méthode de tri par insertion (du plus grand au plus petit)
        //int[] tableTriParInsertionMax = table2.triInsertionMax(tableauEntier);
        //System.out.println("### Tri insertion Max ###");
        //table2.afficherTableau(tableTriParInsertionMax);

        //Appel de la méthode de tri par insertion (du plus petit au plus grand)
        //int[] tableTriParInsertionMin = table2.triInsertionMin(tableauEntier);
        //System.out.println("### Tri insertion Min ###");
        //table2.afficherTableau(tableTriParInsertionMin);

        //OneShoot !!!
        table2.randomShot(tableauEntier);
        
    }

    /*
    Constructeur par défaut donc pas de type de retour
    Porte le même nom que la classe
    */
    public TableauMax(){
        System.out.println("### Tableau sans parametres ###");
        int tableauEntier[] = {0,0,0,0,0};
    }

    /*
    TODO : Le constructeur de cette classe devra initialiser le tableau et le remplir avec des entiers positifs tirés au hasard (entre 0 et 99). 
    TODO : La taille du tableau sera passée en paramètre au constructeur.
    */
    /*
    Constructeur surchargé avec le paramètre tailleTableau
    */
    public TableauMax(int tailleTableau){
        /*
        La fonction Math.random() renvoie un nombre flottant pseudo-aléatoire compris dans l'intervalle [0, 1[ (ce qui signifie que 0 est compris dans l'intervalle mais que 1 en est exclu)
        On a donc ici un chiffre entre 0 et 99.
        (int) permet de cast le double en int renvoyé par la méthode Math.random en faisant un tronkage donc 98.8345763 donnera 98.
        */
        System.out.println("### Tableau avec parametres ###");
        tableauEntier = new int[tailleTableau];
        int nCpt = 0;
        while(nCpt < tailleTableau){
            int randomInt = (int)(Math.random() * 100);
            tableauEntier[nCpt] = randomInt;
            nCpt++;
        }
    }

    /*
    TODO : Question 2 : Ecrire une méthode pour cette classe permettant d’afficher le tableau.
    */
    void afficherTableau(int[] tabToBeScan){
        for(int i  : tabToBeScan){
            System.out.println(i);
        }
    }

    /*
    TODO : Question 3 : Ecrire pour la classe Tableau, la méthode « Tri_minimum » qui met en application l’algorithme de tri décrit dans le cours.
    */
    /*
    Les méthode des classes à par les constructeurs n'ont pas a avoir de majuscules donc on va faire les choses proprement ... le _ ce n'est pas folichon non plus
    */
    public int[] triMinimum(int[] tabDecrease){
        int nCpt = 0;
        int checkVal = 0;
        int valBase = 0;
        int indexMin = 0;
        while(nCpt < tabDecrease.length){
            //Recherche de la plus petite valeur et de son index
            checkVal = tabDecrease[nCpt];
            valBase = tabDecrease[nCpt];
            for(int i = nCpt; i < tabDecrease.length; i++){
                if(checkVal > tabDecrease[i]){
                    checkVal = tabDecrease[i];
                    indexMin = i;
                }
            }
            //Permutation
                
            tabDecrease[nCpt] = checkVal;
            tabDecrease[indexMin] = valBase;
            nCpt++;
        }
        return tabDecrease;
    }

    public void permut(int index1,int index2){
        int valeurTampon = 0;
        
    }
    /*
    ** Question 4 : Par analogie au précédent tri, on peut imaginer un algorithme de tri par maximum. Proposer-enl’algorithme puis implémenter cette méthode.
    */  
    public int[] triMaximum(int[] tabIncrease){
        int nCpt = 0;
        int checkVal = 0;
        int valBase = 0;
        int indexMax = 0;
        while(nCpt < tabIncrease.length){
            //Recherche de la plus petite valeur et de son index
            checkVal = tabIncrease[nCpt];
            valBase = tabIncrease[nCpt];
            for(int i = nCpt; i < tabIncrease.length; i++){
                if(checkVal < tabIncrease[i]){
                    checkVal = tabIncrease[i];
                    indexMax = i;
                }
            }
            //Permutation
            
            tabIncrease[nCpt] = checkVal;
            tabIncrease[indexMax] = valBase;
            nCpt++;
        }
        return tabIncrease;
    }

    /*
    TODO : Question 5 : Ecrire pour la classe Tableau, la méthode « Tri_insertion » qui met en application l’algorithme de tri par insertion décrit dans le cours.
    */
    public int[] triInsertionMax(int[] tabAtrierParInsertion){
        int[] tabTriParInsertionMax = new int[tabAtrierParInsertion.length];
        int nCpt = 0;
        while(nCpt < tabAtrierParInsertion.length){
            if (tabAtrierParInsertion[nCpt] >= tabTriParInsertionMax[nCpt]){
                tabTriParInsertionMax[nCpt] = tabAtrierParInsertion[nCpt];
            }else{
                tabTriParInsertionMax[nCpt+1] = tabTriParInsertionMax[nCpt];
                tabTriParInsertionMax[nCpt] = tabAtrierParInsertion[nCpt];
            }
            nCpt++;
        }
        return tabTriParInsertionMax;
    }

    //Pareil insertion mais du plus petit au plus grand pour le fun.
    public int[] triInsertionMin(int[] tabAtrierParInsertion){
        int[] tabTriParInsertionMin = new int[tabAtrierParInsertion.length];
        int nCpt = 0;
        while(nCpt < tabAtrierParInsertion.length-1){
            if (tabAtrierParInsertion[nCpt] >= tabTriParInsertionMin[nCpt-1]){
                tabTriParInsertionMin[nCpt] = tabAtrierParInsertion[nCpt];
            }else{ 
                tabTriParInsertionMin[nCpt] = tabTriParInsertionMin[nCpt-1];
                tabTriParInsertionMin[nCpt-1] = tabAtrierParInsertion[nCpt];
            }
            nCpt++;
        }
        return tabTriParInsertionMin;
    }

    //Tri par random shot !!!
    public void randomShot(int[] unTableau){
        int taille = unTableau.length;
        int oneShot = 0;
        int nCpt = 0;
        int[] tableRandomShot = new int[taille];
        boolean bCheckRandomShot = true;
        while(nCpt < taille){
            boolean bRandomShot = true;
            System.out.println("Valeur de nCpt : "+nCpt);
            while(bRandomShot){                
                oneShot = random(0, taille);
                System.out.println("Valeur de oneShot :"+oneShot);
                //si la valeur générée n'est pas présente dans le tableau tableRandomShot on la garde
                    int nCptCheck = 0;
                    boolean bPresent = false;

                    for(int i = 0 ; i<tableRandomShot.length;i++){
                        if(oneShot==tableRandomShot[i]){
                            System.out.println("Valeur présente.");
                            bRandomShot = false;
                            break;
                        }else{
                            System.out.println("Valeur non présente.");
                            bCheckRandomShot = false;
                        }
                    }
                if(!bCheckRandomShot || nCpt == 0){
                    tableRandomShot[nCpt]=oneShot;
                    System.out.println("Valeur ajouté à l'index "+nCpt+" : "+oneShot);
                    bCheckRandomShot = true;
                    nCpt++;
                }
            }
            
        }
    }
    
    //Methode qui sort des entiers au hazard entre 2 bornes
    public int random(int vMin, int vMax){
        boolean onContinueAgenererDesChiffres;
        onContinueAgenererDesChiffres = true;
        int rdm = 0;
        while(onContinueAgenererDesChiffres){
            // On génère un entier au pif entre 0 et 99 (nos tableaux ont là même contrainte donc c'est cool).
            rdm = (int)(Math.random()*100);
            // Il faut dégager les chiffre générés qui auront une valeur > a notre taille max et < a notre taille mini
            if(rdm >= vMin && rdm < vMax){
                onContinueAgenererDesChiffres = false;
            }else{
                onContinueAgenererDesChiffres = true;
            }
        }
        return rdm;
    }
}   