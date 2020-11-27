
public class cellule{
    static int [] tab;

    public TriRapide(){
        System.out.println("### Tableau sans parametres ###");
        int tab[] = {0,0,0,0,0};
    }
}


//un commentaire pourri


public class ListeChainee{

    public int Head(){

        if(Empty())         //si la liste est vide
            return-1;       //on retourne une valeur incoherente
        else                //sinon
            return tete.valeur;     //on retourne la valeur de l'element de tete
    } 

    public Cellule Taille(){
        if(Empty())                 //si la liste est vide
            return null;            //on retourne null
        else                        //sinon
        return tete.suivant;        //on retourne la queue de la liste
    }

    public boolean Cons(int e){
        
        //si e est bien un entier positif
        if(e >= 0)
        {
            //on crée un nouvelle cellule ayant pour valeur e
            Cellule tmp = new Cellule(e);
            //On affecte la liste courante en tant que queue
            tmt.suivant = tete;
            //On ecrase la liste courante par la nouvelle liste
            tete = tmp;
            //On signale que l'ajout s'est bien deroulé
            return true;
        }
        else{
            //On signale qu'un erreur c'est produite
            return false;
        }
    }
}
