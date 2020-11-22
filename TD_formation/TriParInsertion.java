public class TriParInsertion {
     static int[] tab ;
    /*
    Constructeur par défaut donc pas de type de retour
    Porte le même nom que la classe
    */
    public TriParInsertion(){
        System.out.println("### Tableau sans parametres ###");
        int tab[] = {0,0,0,0,0};
    }

    /*
    TODO : Le constructeur de cette classe devra initialiser le tableau et le remplir avec des entiers positifs tirés au hasard (entre 0 et 99). 
    TODO : La taille du tableau sera passée en paramètre au constructeur.
    */
    /*
    Constructeur surchargé avec le paramètre tailleTableau
    */
    public TriParInsertion(int tailleTableau){
        /*
        La fonction Math.random() renvoie un nombre flottant pseudo-aléatoire compris dans l'intervalle [0, 1[ (ce qui signifie que 0 est compris dans l'intervalle mais que 1 en est exclu)
        On a donc ici un chiffre entre 0 et 99.
        (int) permet de cast le double en int renvoyé par la méthode Math.random en faisant un tronkage donc 98.8345763 donnera 98.
        */
        System.out.println("### Tableau avec parametres ###");
        tab = new int[tailleTableau];
        int nCpt = 0;
        while(nCpt < tailleTableau){
            int randomInt = (int)(Math.random() * 100);
            tab[nCpt] = randomInt;
            nCpt++;
        }
    }
     
    public static void tri_insertion(int tab[]) 
    {  
         int taille = tab.length;  
       
         for (int i = 1; i < taille; i++)
         { 
              int index = tab[i];  
              int j = i-1;  
           
              while(j >= 0 && tab[j] > index)  
              {
                   tab[j+1] = tab[j];  
                   j--;  
              }  
              tab[j+1] = index; 
       }  
    }
 
    static void displayTab(int[] tab)
    {      
         for(int i=0; i < tab.length; i++)
         {  
              System.out.print(tab[i] + " ");  
         } 
         System.out.println();
    }
 
    public static void main(String str[])
    {   
         TriParInsertion table = new TriParInsertion(5);
       
         System.out.println("Avant le tri par insertion");    
         table.displayTab(tab);
           
         //trie un tableau en utilisant le tri par insertion
         table.tri_insertion(tab); 
          
         System.out.println("Apres le tri par insertion");  
         table.displayTab(tab);   
   } 
}