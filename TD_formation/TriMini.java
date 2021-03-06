public class TriMini {
    static int[] tab ;
    
    public TriMini(){
        System.out.println("### Tableau sans parametres ###");
        int tab[] = {0,0,0,0,0};
    }
    
    public TriMini(int tailleTableau){
        System.out.println("### Tableau avec parametres ###");
        tab = new int[tailleTableau];
        int nCpt = 0;
        while(nCpt < tailleTableau){
            int randomInt = (int)(Math.random() * 100);
            tab[nCpt] = randomInt;
            nCpt++;
        }
    }
    
    public static void tri_selection(int[] tab)
    {
        for (int i = 0; i < tab.length - 1; i++)  
        {
            int index = i;  
            for (int j = i + 1; j < tab.length; j++)
            {
                if (tab[j] < tab[index]){ 
                    index = j;
                }
            }
            
            int min = tab[index];
            tab[index] = tab[i]; 
            tab[i] = min;
        }
    }
    static void displayTab(int[] tab){
        for(int i=0; i < tab.length; i++)
        {  
            System.out.print(tab[i] + " ");  
        } 
        System.out.println();    
    }
    
    public static void main(String a[])
    {  
        TriMini table = new TriMini(5);
        System.out.println("**** Avant le tri par selection *****");
        table.displayTab(tab);
        //tri d un tableau avec l algorithme de tri par selection
        tri_selection(tab);
        
        System.out.println("**** Apres le tri par selection ****");  
        table.displayTab(tab); 
    } 
}