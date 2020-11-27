import javax.swing.text.StyledEditorKit.BoldAction;

public class Liste{
    int element;
    Liste suivant;

    Liste(int premier, Liste reste){
        element = premier;
        suivant = reste;
    }

    public int premier(){
        return element;
    }
    public Liste reste (){
        return suivant;
    }

    public void modifiePremier(int elem){
        element = elem;
    }
    public void modifieReste(Liste reste){
        suivant = reste;
    }
    public int longueur(){
        int cpt = 0;
        Liste ref=this;
        while(ref != null){ // != (different)
            cpt++;
            ref=ref.reste(); // ou ref=ref.suivant
        }
        return cpt;
    }
    public Boolean contient(int elem){
        Liste ref=this;
        while(ref != null){
            if(ref.premier() == elem)   //ou re.element==elem
                return true;            // l'element a ete retrouvé
            else ref=ref.reste();       //ou ref=ref.suivant
        }
            return false;               //l'element n'a pas ete retrouvé
    }
    public Liste insertionDebut(int elem){
        return new Liste(elem, this);
    }
    public void concatenation(Liste liste){
        Liste ref=this;
        while(ref.reste()!=null){
            ref=ref.reste();
        }
        //ref pointe maintenant sur la derniere cellule de la liste
        ref.modifieReste(liste);        //ou ref.suivant=liste
    }
    public Liste suppressionPremier(int elem){
        Liste ref=this;   //reference qui cherche l'element
        Liste pred=null;                            //predecesseur initialise null 
        while(ref != null && ref.premier() != elem){     //recherche elem
            pred = ref;                               //avance pred
            ref = ref.reste();                        //avance ref
    }
        if(ref != null){                            //elem trouve dans la liste ref
            if(pred == null)                        //premiere cellule de la liste 
                return ref.reste();                 //retourne le reste de la liste
            else{                                   //milieur de la liste
                pred.modifieReste(ref.reste());     //modifie le suivant du predecesseur
                return this;        //premiere cellule non modifie
            }               
        }
        else return this;  //element non retrouve
    }

}