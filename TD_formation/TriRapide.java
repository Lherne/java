public class TriRapide {
    static int[] tab ;
    
    public TriRapide(){
        System.out.println("### Tableau sans parametres ###");
        int tab[] = {0,0,0,0,0};
    }
    
    public TriRapide(int tailleTableau){
        System.out.println("### Tableau avec parametres ###");
        tab = new int[tailleTableau];
        int nCpt = 0;
        while(nCpt < tailleTableau){
            int randomInt = (int)(Math.random() * 100);
            tab[nCpt] = randomInt;
            nCpt++;
        }
    }

    static void echangerElements(int[] t, int m, int n) {
        int temp = t[m];

        t[m] = t[n];
        t[n] = temp;
    }

    static int partition(int[] t, int m, int n) {
        int v = t[m];                 // valeur pivot
        int i = m-1;
        int j = n+1;                  // indice final du pivot

        while (true) {
            do {
                j--;
            } while (t[j] > v);
            do {
                i++;
            } while (t[i] < v);
            if (i<j) {
                echangerElements(t, i, j);
            } else {
                return j;
            }
        }
    }

    static void triRapide(int[] t, int m, int n) {
        if (m<n) {
            int p = partition(t, m, n);
            triRapide(t, m, p);
            triRapide(t, p+1, n);
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

    public static void main(String[] args)
    {
        TriRapide table = new TriRapide(5);
        table.displayTab(tab);
        
        System.out.println("---Avant le tri rapide---"); 
        
        table.displayTab(tab);
        
        // tri des elements de tableau avec le tri a bulle
        table.triRapide(tab,0,tab.length-1);
        
        System.out.println("---Apres le tri rapide---");  
        
        table.displayTab(tab); 
    }
}
