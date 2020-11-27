public class TriBulle {
    static int[] tab ;
    
    public TriBulle(){
        System.out.println("### Tableau sans parametres ###");
        int tab[] = {0,0,0,0,0};
    }
    
    public TriBulle(int tailleTableau){
        System.out.println("### Tableau avec parametres ###");
        tab = new int[tailleTableau];
        int nCpt = 0;
        while(nCpt < tailleTableau){
            int randomInt = (int)(Math.random() * 100);
            tab[nCpt] = randomInt;
            nCpt++;
        }
    }
    
    static void tri_bulle(int[] tab)
    {  
        int taille = tab.length;  
        int tmp = 0;  
        for(int i=0; i < taille; i++) 
        {
            for(int j=1; j < (taille-i); j++)
            {  
                if(tab[j-1] > tab[j])
                {
                    //echanges des elements
                    tmp = tab[j-1];  
                    tab[j-1] = tab[j];  
                    tab[j] = tmp;  
                }
                
            }
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
        TriBulle table = new TriBulle(5);
        table.displayTab(tab);
        
        System.out.println("---Avant le tri a bulle---"); 
        
        table.displayTab(tab);
        
        // tri des elements de tableau avec le tri a bulle
        table.tri_bulle(tab);
        
        System.out.println("---Apres le tri a bulle---");  
        
        table.displayTab(tab); 
    }
}
